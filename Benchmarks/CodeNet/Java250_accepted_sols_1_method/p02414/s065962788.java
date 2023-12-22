import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

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

        long[][] C = new long[n][l];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < l; j++) {
                for (int k = 0; k < m; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
                if (j != 0) {
                    out.print(" ");
                }
                out.print(C[i][j]);
            }
            out.printf("\n");
        }

        out.flush();
    }
}
