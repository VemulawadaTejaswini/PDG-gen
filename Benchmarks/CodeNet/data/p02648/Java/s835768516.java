import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        LightWriter out = new LightWriter(outputStream);
        DKnapsackQueriesOnATree solver = new DKnapsackQueriesOnATree();
        solver.solve(1, in, out);
        out.close();
    }

    static class DKnapsackQueriesOnATree {
        private static final int DMAX = 12;
        private static final int DMAX2 = (1 << DMAX) - 1;
        private static final int MAX = 100002;

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints();
            int[][] dp = new int[DMAX2][MAX];
            int[] vs = new int[n], ws = new int[n];
            for (int i = 0; i < n; i++) {
                vs[i] = in.ints();
                ws[i] = in.ints();
            }

            int n0 = Math.min(DMAX2, n);
            for (int i = ws[0]; i < MAX; i++) dp[0][i] = vs[0];
            for (int k = 1; k < n0; k++) {
                int parent = (k - 1) / 2;
                System.arraycopy(dp[parent], 0, dp[k], 0, ws[k]);
                for (int i = ws[k]; i < MAX; i++) {
                    dp[k][i] = Math.max(dp[parent][i], dp[parent][i - ws[k]] + vs[k]);
                }
            }

            int queries = in.ints();
            for (int i = 0; i < queries; i++) {
                int node = in.ints() - 1, l = in.ints();
                if (node < n0) {
                    out.ans(dp[node][l]).ln();
                    continue;
                }
                int m = 0;
                int cur = node;
                while (cur >= n0) {
                    cur = (cur - 1) / 2;
                    m++;
                }
                long ans = 0;
                outer:
                for (int j = 0; j < (1 << m); j++) {
                    int w = 0, v = 0, t = j, now = node;
                    for (int k = 0; k < m; k++) {
                        if ((t & 1) == 1) {
                            w += ws[now];
                            v += vs[now];
                            if (w > l) continue outer;
                        }
                        t >>= 1;
                        now = (now - 1) >> 1;
                    }
                    ans = Math.max(ans, dp[cur][l - w] + v);
                }
                out.ans(ans).ln();
            }
        }

    }

    static class LightScanner implements AutoCloseable {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

        public void close() {
            try {
                this.reader.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }

    static class LightWriter implements AutoCloseable {
        private final Writer out;
        private boolean autoflush = false;
        private boolean breaked = true;

        public LightWriter(Writer out) {
            this.out = out;
        }

        public LightWriter(OutputStream out) {
            this(new OutputStreamWriter(new BufferedOutputStream(out), Charset.defaultCharset()));
        }

        public LightWriter print(char c) {
            try {
                out.write(c);
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter print(String s) {
            try {
                out.write(s, 0, s.length());
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter ans(String s) {
            if (!breaked) {
                print(' ');
            }
            return print(s);
        }

        public LightWriter ans(long l) {
            return ans(Long.toString(l));
        }

        public LightWriter ans(int i) {
            return ans(Integer.toString(i));
        }

        public LightWriter ln() {
            print(System.lineSeparator());
            breaked = true;
            if (autoflush) {
                try {
                    out.flush();
                } catch (IOException ex) {
                    throw new UncheckedIOException(ex);
                }
            }
            return this;
        }

        public void close() {
            try {
                out.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }
}

