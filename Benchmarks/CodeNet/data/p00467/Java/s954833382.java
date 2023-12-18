

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(new InputStreamReader(System.in))) {
            while (sc.hasNextInt()) {
                int cellCount = sc.nextInt();
                int diceCount = sc.nextInt();

                if (cellCount == 0) {
                    return;
                }

                List<SugorokuCell> cells = readCells(sc, cellCount);
                int[] dices = readDices(sc, diceCount);

                int result = countGoalStep(cells, dices);
                System.out.println(result);
            }
        }
    }

    private static int[] readDices(Scanner sc, int diceCount) {
        int[] dices = new int[diceCount];

        for (int i = 0; i < diceCount; i++) {
            dices[i] = sc.nextInt();
        }

        return dices;
    }

    private static List<SugorokuCell> readCells(Scanner sc, int cellCount) {
        List<SugorokuCell> cells = new ArrayList<>();

        for (int i = 0; i < cellCount; i++) {
            int cellNo = i;
            int offset = sc.nextInt();
            cells.add(new SugorokuCell(cellNo, offset));
        }

        return cells;
    }

    private static int countGoalStep(List<SugorokuCell> cells, int[] dices) {
        int currentCell = 0;
        int goalCell = cells.size() - 1;

        for (int i = 0; i < dices.length; i++) {
            int dice = dices[i];
            currentCell += dice;

            if (goalCell <= currentCell) {
                return i + 1;
            }

            SugorokuCell cell = cells.get(currentCell);
            currentCell += cell.getOffset();

            if (goalCell <= currentCell) {
                return i + 1;
            }

            if (currentCell < 0) {
                currentCell = 0;
            }

        }

        throw new RuntimeException("This line not be execute, "
                + "Because every inputs can be resolve");
    }

    public static class SugorokuCell {
        private final int cellNo;
        private final int offset;

        public SugorokuCell(int cellNo, int offset) {
            this.cellNo = cellNo;
            this.offset = offset;
        }

        public int getCellNo() {
            return cellNo;
        }

        public int getOffset() {
            return offset;
        }
    }
}