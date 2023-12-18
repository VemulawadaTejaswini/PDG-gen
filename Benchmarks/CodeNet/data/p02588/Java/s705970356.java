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
        A_IntegerProduct solver = new A_IntegerProduct();
        solver.solve(1, in, out);
        out.close();
    }

    static class A_IntegerProduct {
        final int PRECISION = 9;

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int[][] a = new int[100][100];
            int maxP2 = 0;
            int maxP5 = 0;
            long ans = 0;
            for (int i = 0; i < n; i++) {
                long x = nextNumber(in);
                int p2 = 0;
                while (x % 2 == 0) {
                    x /= 2;
                    ++p2;
                }
                int p5 = 0;
                while (x % 5 == 0) {
                    x /= 5;
                    ++p5;
                }

                for (int u = 0; u <= maxP2; u++) {
                    for (int v = 0; v <= maxP5; v++) {
                        if (Math.min(u + p2, v + p5) >= 2 * PRECISION) {
                            ans += a[u][v];
                        }
                    }
                }
                ++a[p2][p5];
                maxP2 = Math.max(maxP2, p2);
                maxP5 = Math.max(maxP5, p5);
            }
            out.println(ans);
        }

        private long nextNumber(FastScanner in) {
            String s = in.next();
            int i = s.indexOf('.');
            if (i < 0) {
                s = s + ".";
                i = s.length() - 1;
            }
            while (i + PRECISION >= s.length()) {
                s = s + "0";
            }
            return Long.parseLong(s.replace(".", ""));
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

