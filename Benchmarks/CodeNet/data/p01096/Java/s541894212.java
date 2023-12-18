import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScanner in = new MyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DarumaOtoshi solver = new DarumaOtoshi();
        solver.solve(1, in, out);
        out.close();
    }

    static class DarumaOtoshi {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            while (true) {
                int n = in.Int();
                if (n == 0) return;
                int[] w = in.Int(n);
                int[][] dp = new int[n + 1][n + 1];
                for (int i = 0; i < n; i++) {
                    Arrays.fill(dp[i], -1);
                }
                int ans = calc(w, dp, 0, n);
                out.println(ans);
            }
        }

        private int calc(int[] w, int[][] dp, int l, int r) {
            if (dp[l][r] != -1) {
                return dp[l][r];
            }
            if (r <= l) {
                return 0;
            }
            int ret = 0;
            if (Math.abs(w[l] - w[r - 1]) <= 1 && calc(w, dp, l + 1, r - 1) == r - l - 2) {
                ret = r - l;
            }
            for (int i = l + 1; i < r; i++) {
                ret = Math.max(ret, calc(w, dp, l, i) + calc(w, dp, i, r));
            }
            return dp[l][r] = ret;
        }

    }

    static class MyScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public MyScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int Int() {
            return Integer.parseInt(next());
        }

        public int[] Int(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Int();
            }
            return a;
        }

    }
}


