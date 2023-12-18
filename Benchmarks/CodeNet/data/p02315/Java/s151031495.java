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
        KnapsackAizu solver = new KnapsackAizu();
        solver.solve(1, in, out);
        out.close();
    }

    static class KnapsackAizu {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            KnapsackAizu.Item[] a = new KnapsackAizu.Item[n];
            int w = in.nextInt();

            for (int i = 0; i < n; i++) {
                a[i] = new KnapsackAizu.Item(in.nextInt(), in.nextInt());
            }

            int[][] dp = new int[w + 1][n + 1];
            for (int i = 1; i < w + 1; i++) {
                for (int j = 1; j < n + 1; j++) {
                    if (i >= a[j - 1].weight) {
                        dp[i][j] = Math.max(a[j - 1].value + dp[i - a[j - 1].weight][j - 1], dp[i][j - 1]);
                    }
                }
            }

            out.printf("%d\n", dp[w][n]);
        }

        static class Item {
            int value;
            int weight;

            public Item(final int value, final int weight) {
                this.value = value;
                this.weight = weight;
            }

        }

    }
}


