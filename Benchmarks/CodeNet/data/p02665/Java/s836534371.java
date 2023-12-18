import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        C_Folia solver = new C_Folia();
        solver.solve(1, in, out);
        out.close();
    }

    static class C_Folia {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            long maxAtDepth = 1;
            long[] inner = new long[n + 1];
            long[] leaves = new long[n + 1];
            final long infinity = Long.MAX_VALUE / 2 - 100;
            for (int i = 0; i <= n; i++) {
                leaves[i] = in.nextInt();
                if (maxAtDepth < leaves[i]) {
                    out.println(-1);
                    return;
                }
                inner[i] = maxAtDepth - leaves[i];
                maxAtDepth = Math.min(infinity, 2 * inner[i]);
            }
            inner[n] = 0;
            for (int i = n - 1; i >= 0; i--) {
                inner[i] = Math.min(inner[i], inner[i + 1] + leaves[i + 1]);
            }

            long ans = 0;
            for (int i = 0; i <= n; i++) {
                ans += leaves[i];
                ans += inner[i];
            }
            out.println(ans);
        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(in.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

