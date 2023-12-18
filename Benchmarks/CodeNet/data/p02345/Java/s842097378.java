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
        RMQAizu solver = new RMQAizu();
        solver.solve(1, in, out);
        out.close();
    }

    static class RMQAizu {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int q = in.nextInt();
            int[] a = new int[n];
            Arrays.fill(a, Integer.MAX_VALUE);
            int[] b = new int[4 * n];

            build(0, 0, n - 1, a, b);
            while (q-- != 0) {
                int o = in.nextInt();
                int l = in.nextInt();
                int r = in.nextInt();

                if (o == 0) {
                    update(0, 0, n - 1, l, r, a, b);
                } else {
                    out.printf("%d\n", query(0, 0, n - 1, l, r, b));
                }
            }
        }

        private void build(int n, int s, int e, int[] a, int[] b) {
            if (s == e) {
                b[n] = a[s];
            } else {
                int m = (s + e) / 2;
                build(2 * n + 1, s, m, a, b);
                build(2 * n + 2, m + 1, e, a, b);

                b[n] = Math.min(b[2 * n + 1], b[2 * n + 2]);
            }
        }

        private void update(int n, int s, int e, int idx, int val, int[] a, int[] b) {
            if (s == e) {
                a[idx] = val;
                b[n] = val;
            } else {
                int m = (s + e) / 2;
                if (idx >= s && idx <= m) {
                    update(2 * n + 1, s, m, idx, val, a, b);
                } else {
                    update(2 * n + 2, m + 1, e, idx, val, a, b);
                }

                b[n] = Math.min(b[2 * n + 1], b[2 * n + 2]);
            }
        }

        private int query(int n, int s, int e, int l, int r, int[] b) {
            if (r < s || e < l) {
                return Integer.MAX_VALUE;
            }

            if (l <= s && e <= r) {
                return b[n];
            } else {
                int m = (s + e) / 2;
                int ml = query(2 * n + 1, s, m, l, r, b);
                int mr = query(2 * n + 2, m + 1, e, l, r, b);

                return Math.min(ml, mr);
            }
        }

    }
}


