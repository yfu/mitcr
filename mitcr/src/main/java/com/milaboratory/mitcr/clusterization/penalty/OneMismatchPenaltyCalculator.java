/*
 * MiTCR <http://milaboratory.com>
 *
 * Copyright (c) 2010-2013:
 *     Bolotin Dmitriy     <bolotin.dmitriy@gmail.com>
 *     Chudakov Dmitriy    <chudakovdm@mail.ru>
 *
 * MiTCR is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.milaboratory.mitcr.clusterization.penalty;

import com.milaboratory.core.clone.Clone;
import com.milaboratory.mitcr.clusterization.PenaltyCalculator;

public class OneMismatchPenaltyCalculator implements PenaltyCalculator {
    public static OneMismatchPenaltyCalculator INSTANCE = new OneMismatchPenaltyCalculator();

    private OneMismatchPenaltyCalculator() {
    }

    @Override
    public int getMaxMismatches() {
        return 1;
    }

    @Override
    public float getTotalPenalty(Clone clone0, Clone clone1) {
        return 1.0f;
    }

    @Override
    public float getMaxPenaltyValue() {
        return 1.0f;
    }
}
