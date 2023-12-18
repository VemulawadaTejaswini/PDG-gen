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
        LevenshteinDistance solver = new LevenshteinDistance();
        solver.solve(1, in, out);
        out.close();
    }

    static class LevenshteinDistance {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            final String x = in.next();
            final String y = in.next();

            out.printf("%d\n", editDistance(x, x.length(), y, y.length()));
        }

        private int editDistance(final String a, final int alen, final String b, final int blen) {
            int[][] dp = new int[alen + 1][blen + 1];

            for (int i = 0; i < alen + 1; i++) {
                dp[i][0] = i;
            }

            for (int j = 0; j < blen + 1; j++) {
                dp[0][j] = j;
            }

            for (int i = 1; i < alen + 1; i++) {
                for (int j = 1; j < blen + 1; j++) {
                    dp[i][j] = Math.min(dp[i][j - 1] + 1, dp[i - 1][j] + 1);

                    if (a.charAt(i - 1) == b.charAt(j - 1)) {
                        dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - 1]);
                    } else {
                        dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - 1] + 1);
                    }
                }
            }

            return dp[alen][blen];
        }

    }
}


