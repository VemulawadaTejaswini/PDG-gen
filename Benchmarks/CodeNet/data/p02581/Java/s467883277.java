import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
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
        FBraveCHAIN solver = new FBraveCHAIN();
        solver.solve(1, in, out);
        out.close();
    }

    static class FBraveCHAIN {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints();
            int[] a = new int[3 * n];
            for (int i = 0; i < 3 * n; i++) a[i] = in.ints() - 1;

            int all = 0;
            int[][] dp = new int[n][n];
            ArrayUtil.fill(dp, -n);
            dp[a[0]][a[1]] = dp[a[1]][a[0]] = 0;
            int[] m2 = new int[n];
            Arrays.fill(m2, -n);
            m2[a[0]] = m2[a[1]] = 0;
            int cur = 0, max = 0;
            int[] dx = new int[8 * n], dy = new int[8 * n], nv = new int[8 * n];
            int[] t = new int[3];
            for (int i = 1; i < n; i++) {
                cur = 0;
                t[0] = a[3 * i - 1];
                t[1] = a[3 * i];
                t[2] = a[3 * i + 1];
                // x y Z Z Z => [Z Z Z] x y
                if (t[0] == t[1] && t[1] == t[2]) {
                    all++;
                    continue;
                }
                for (int j = 0; j < 3; j++) {
                    for (int o1 = 0; o1 < n; o1++) {
                        // v w X Y Z => (w Y Z) v X
                        dx[cur] = t[j];
                        dy[cur] = o1;
                        nv[cur++] = m2[o1];
                    }
                }
                for (int j = 0; j < 3; j++) {
                    int o1 = t[(j + 1) % 3], o2 = t[(j + 2) % 3];
                    // x x X Y Z => [x x X] Y Z
                    dx[cur] = o1;
                    dy[cur] = o2;
                    nv[cur++] = dp[t[j]][t[j]] + 1;
                    // v w X Y Z => (v w X) Y Z
                    dx[cur] = o1;
                    dy[cur] = o2;
                    nv[cur++] = max;
                }
                for (int j = 0; j < 3; j++) {
                    int s1 = t[(j + 1) % 3], s2 = t[(j + 2) % 3];
                    if (s1 != s2) continue;
                    int o1 = t[j];
                    for (int o2 = 0; o2 < n; o2++) {
                        // x y X X Z => [x X X] y Z
                        dx[cur] = o1;
                        dy[cur] = o2;
                        nv[cur++] = dp[s1][o2] + 1;
                    }
                }
                for (int j = 0; j < cur; j++) {
                    if (nv[j] < 0) continue;
                    dp[dx[j]][dy[j]] = Math.max(dp[dx[j]][dy[j]], nv[j]);
                    dp[dy[j]][dx[j]] = Math.max(dp[dy[j]][dx[j]], nv[j]);
                    max = Math.max(max, nv[j]);
                    m2[dx[j]] = Math.max(m2[dx[j]], nv[j]);
                    m2[dy[j]] = Math.max(m2[dy[j]], nv[j]);
                }
            }
            int last = a[3 * n - 1], ans = dp[last][last] + 1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    ans = Math.max(ans, dp[i][j]);
                }
            }
            out.ans(ans + all).ln();
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

    static final class ArrayUtil {
        private ArrayUtil() {
        }

        public static void fill(int[] a, int v) {
            Arrays.fill(a, v);
        }

        public static void fill(int[][] a, int v) {
            for (int i = 0; i < a.length; i++) {
                fill(a[i], v);
            }
        }

    }
}

