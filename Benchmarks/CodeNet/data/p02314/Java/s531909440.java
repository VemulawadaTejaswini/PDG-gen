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
        AizuMinCoinChange solver = new AizuMinCoinChange();
        solver.solve(1, in, out);
        out.close();
    }

    static class AizuMinCoinChange {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int m = in.nextInt();
            int n = in.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }

            out.printf("%d\n", minCoins(m, a, n));
        }

        private int minCoins(int m, int[] a, int n) {
            int[] dp = new int[m + 1];

            for (int i = 1; i < m + 1; i++) {
                dp[i] = Integer.MAX_VALUE - 1;
                for (int j = 0; j < n; j++) {
                    if (i >= a[j]) {
                        dp[i] = Math.min(dp[i], 1 + dp[i - a[j]]);
                    }
                }
            }

            return dp[m];
        }

    }
}


