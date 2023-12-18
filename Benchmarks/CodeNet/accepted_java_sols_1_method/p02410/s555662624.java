import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRow = sc.nextInt();
        int numCol = sc.nextInt();
        int[][] mat = new int[numRow][numCol];
        int[] vecIn = new int[numCol];
        int[] vecOut = new int[numRow];
        int i, j;
        for (i = 0; i < numRow; i++) {
            for (j = 0; j < numCol; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (j = 0; j < numCol; j++) vecIn[j] = sc.nextInt();
        for (i = 0; i < numRow; i++) {
            for (j = 0; j < numCol; j++) {
                vecOut[i] += mat[i][j] * vecIn[j];
            }
            System.out.println(vecOut[i]);
        }
    }
}
