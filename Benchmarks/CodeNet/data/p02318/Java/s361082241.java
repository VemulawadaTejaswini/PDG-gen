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

            out.printf("%d\n", levenshtein(x, y));
        }

        private int levenshtein(final String a, final String b) {
            final int alen = a.length();
            final int blen = b.length();

            int[][] dp = new int[alen + 1][blen + 1];
            for (int i = 0; i < alen + 1; i++) {
                dp[i][0] = i;
            }

            for (int j = 0; j < blen + 1; j++) {
                dp[0][j] = j;
            }

            for (int i = 1; i < alen + 1; i++) {
                for (int j = 1; j < blen + 1; j++) {
                    int insertion = dp[i][j - 1] + 1;
                    int deletion = dp[i - 1][j] + 1;
                    int match = dp[i - 1][j - 1];
                    int mismatch = dp[i - 1][j - 1] + 1;

                    if (a.charAt(i - 1) == b.charAt(j - 1)) {
                        dp[i][j] = Math.min(Math.min(insertion, deletion), match);
                    } else {
                        dp[i][j] = Math.min(Math.min(insertion, deletion), mismatch);
                    }
                }
            }

            return dp[alen][blen];
        }

    }
}


