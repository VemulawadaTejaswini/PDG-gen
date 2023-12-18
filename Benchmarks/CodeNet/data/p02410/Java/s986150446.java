import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());

        int[][] A = new int[n][m];
        int[][] B = new int[m][1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = Integer.parseInt(sc.next());
            }
        }

        for (int i = 0; i < m; i++) {
            B[i][0] = Integer.parseInt(sc.next());
        }

        int[][] C = new int[n][1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                C[i][0] += A[i][j] * B[j][0];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(C[i][0]);
        }
    }
}