import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt();
        int cols = inp.nextInt();

        int aMatrix[][] = new int[rows][cols];
        int bMatrix[][] = new int[cols][1];


        for (int k = 0; k < rows; k++) {
            for (int j = 0; j < cols; j++) {
                aMatrix[k][j] = inp.nextInt();
            }
        }

        for (int j = 0; j < cols; j++) {
            bMatrix[j][0] = inp.nextInt();
        }

        int total[][] = matrixCalc(aMatrix, bMatrix, rows, cols);
        for (int[] item : total) {
            for (int secondItem : item) {
                System.out.println(secondItem);
            }
        }
    }

    public static int[][] matrixCalc(int[][] aMatrix, int[][] bMatrix, int rows, int cols) {
        int totals[][] = new int[rows][1];
        for (int k = 0; k < rows; k++) {
            int total = 0;
            for (int j = 0; j < cols; j++) {
                total += aMatrix[k][j] * bMatrix[j][0];
            }

            totals[k][0] = total;
        }

        return totals;
    }
}

