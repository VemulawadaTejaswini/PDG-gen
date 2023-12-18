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
        KnapsackAizu1 solver = new KnapsackAizu1();
        solver.solve(1, in, out);
        out.close();
    }

    static class KnapsackAizu1 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int w = in.nextInt();
            int[] vs = new int[n];
            int[] ws = new int[n];

            for (int i = 0; i < n; i++) {
                vs[i] = in.nextInt();
                ws[i] = in.nextInt();
            }

            int[] dp = new int[w + 1];
            for (int i = 1; i < w + 1; i++) {
                for (int j = 0; j < n; j++) {
                    if (i >= ws[j]) {
                        dp[i] = Math.max(dp[i], vs[j] + dp[i - ws[j]]);
                    }
                }
            }

            out.printf("%d\n", dp[w]);
        }

    }
}


