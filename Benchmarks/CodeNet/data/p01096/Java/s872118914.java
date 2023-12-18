import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DDarumaOtoshi solver = new DDarumaOtoshi();
        solver.solve(1, in, out);
        out.close();
    }

    static class DDarumaOtoshi {
        private static int n;
        private static int[] a;
        private static int[][] dp;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            n = in.nextInt();
            while (n != 0) {
                a = new int[n];
                dp = new int[n][n];
                for (int i = 0; i < n; i++) {
                    a[i] = in.nextInt();
                    Arrays.fill(dp[i], -1);
                }
                out.println(2 * calc(0, n - 1));

                //Arrays.stream(dp).map(Arrays::toString).forEach(System.out::println);

                n = in.nextInt();
            }
        }

        private static int calc(int i, int j) {
            if (i >= j || i < 0 || n <= j) return 0;
            if (dp[i][j] >= 0) return dp[i][j];
            int res = Math.max(calc(i + 1, j), calc(i, j - 1));

            for (int k = i + 1; k <= j; k++) {
                if (Math.abs(a[i] - a[k]) <= 1) {
                    res = Math.max(res, calcAll(i + 1, k - 1) + 1 + calc(k + 1, j));
                }
            }

            for (int k = i; k <= j - 1; k++) {
                if (Math.abs(a[k] - a[j]) <= 1) {
                    res = Math.max(res, calc(i, k - 1) + calcAll(k + 1, j - 1) + 1);
                }
            }
            return dp[i][j] = res;
        }

        private static int calcAll(int i, int j) {
            int count = Math.max(0, j - i + 1);
            int result = calc(i, j);
            if (result * 2 == count) {
                return result;
            } else {
                return -1;
            }
        }

    }
}


