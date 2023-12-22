import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRow1 = sc.nextInt();
        int numCol1Row2 = sc.nextInt();
        int numCol2 = sc.nextInt();

        int[][] mat1 = new int[numRow1][numCol1Row2];
        int[][] mat2 = new int[numCol1Row2][numCol2];
        long[][] matOut = new long[numRow1][numCol2];
        int i, j, k;
        for (i = 0; i < numRow1; i++) {
            for (j = 0; j < numCol1Row2; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < numCol1Row2; i++) {
            for (j = 0; j < numCol2; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < numRow1; i++) {
            for (j = 0; j < numCol2; j++) {
                for (k = 0; k < numCol1Row2; k++) {
                    matOut[i][j] += mat1[i][k] * mat2[k][j];
                }
                if (j != 0) System.out.print(" ");
                System.out.print(matOut[i][j]);
            }
            System.out.println();
        }
    }
}
