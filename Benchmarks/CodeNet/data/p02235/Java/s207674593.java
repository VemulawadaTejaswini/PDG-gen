import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        LCS solver = new LCS();
        solver.solve(1, in, out);
        out.close();
    }

    static class LCS {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int q = in.nextInt();
            for (int i = 0; i < q; i++) {
                String s = in.next();
                String t = in.next();
                out.println(Str.LongestCommonSubsequence(s, t));
            }

        }

    }

    static class Str {
        public static int LongestCommonSubsequence(String s, String t) {
            int[][] dp = new int[s.length() + 1][t.length() + 1];
            for (int i = 0; i <= s.length(); i++) {
                for (int j = 0; j <= t.length(); j++) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 0;
                    } else {
                        if (s.charAt(i - 1) == t.charAt(j - 1)) {
                            dp[i][j] = dp[i - 1][j - 1] + 1;
                        } else {
                            dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                        }
                    }
                }
            }
            return dp[s.length()][t.length()];
        }

    }
}


