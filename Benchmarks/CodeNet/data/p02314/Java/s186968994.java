import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        CoinChangeInfinite solver = new CoinChangeInfinite();
        solver.solve(1, in, out);
        out.close();
    }

    static class CoinChangeInfinite {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] a = new int[m];

            for (int i = 0; i < m; i++) {
                a[i] = in.nextInt();
            }

            out.printf("%d\n", minCoins(n, a, m));
        }

        private int minCoins(int a, int[] c, int n) {
            int[] dp = new int[a + 1];

            for (int i = 1; i < a + 1; i++) {
                dp[i] = Integer.MAX_VALUE;
                for (int j = 0; j < n; j++) {
                    if (i >= c[j]) {
                        dp[i] = Math.min(dp[i], 1 + dp[i - c[j]]);
                    }
                }
            }

            return dp[a];
        }

    }
}


