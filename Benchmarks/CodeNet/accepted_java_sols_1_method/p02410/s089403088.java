import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[][] a = new int[n][m];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = Integer.parseInt(sc.next());
            }
        }
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(sc.next());
        }

        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c[i] += a[i][j] * b[j];
            }
            out.printf("%d\n", c[i]);
        }
        out.flush();
    }
}
