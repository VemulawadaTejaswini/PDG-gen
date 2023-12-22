import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int l = Integer.parseInt(sc.next());

        int[][] A = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = Integer.parseInt(sc.next());
            }
        }

        int[][] B = new int[m][l];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < l; j++) {
                B[i][j] = Integer.parseInt(sc.next());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < l; j++) {
                long tmp = 0;
                for (int k = 0; k < m; k++) {
                    tmp += A[i][k] * B[k][j];
                }

                if (j == l - 1) {
                    System.out.printf("%d\n", tmp);
                } else {
                    System.out.printf("%d ", tmp);
                }
            }
        }
    }
}