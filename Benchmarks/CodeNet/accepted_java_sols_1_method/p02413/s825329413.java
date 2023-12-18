import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRow = sc.nextInt();
        int numCol = sc.nextInt();
        int[][] mat = new int[numRow + 1][numCol + 1];
        int i, j;
        for (i = 0; i < numRow; i++) {
            for (j = 0; j < numCol; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < numRow; i++) {
            for (j = 0; j < numCol; j++) {
                mat[i][numCol] += mat[i][j];
            }
        }
        for (j = 0; j <= numCol; j++) {
            for (i = 0; i < numRow; i++) {
                mat[numRow][j] += mat[i][j];
            }
        }
        for (i = 0; i <= numRow; i++) {
            for (j = 0; j <= numCol; j++) {
                if (j != 0) System.out.print(" ");
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}
