import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashMap;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.util.Map;
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
        JAG2012E solver = new JAG2012E();
        solver.solve(1, in, out);
        out.close();
    }

    static class JAG2012E {
        private Map<String, Integer> nameToIndex = new HashMap<>();
        private int n;
        private long[] adj;
        private int[] power;
        private int[] powerSumFrom;
        private int res = 0;

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            while (true) {
                n = in.ints();
                if (n == 0) break;

                nameToIndex.clear();
                adj = new long[n];
                power = new int[n];
                powerSumFrom = new int[n + 1];
                for (int i = 0; i < n; i++) {
                    int index = toIndex(in.string());
                    power[index] = in.ints();
                    adj[index] = 0;
                    int m = in.ints();
                    for (int j = 0; j < m; j++) {
                        adj[index] |= 1L << toIndex(in.string());
                    }
                }
                for (int i = n - 1; i >= 0; i--) powerSumFrom[i] = powerSumFrom[i + 1] + power[i];
                res = 0;
                solve(1, power[0], adj[0]);
                out.ans(res).ln();
            }
        }

        private int toIndex(String name) {
            if (!nameToIndex.containsKey(name)) nameToIndex.put(name, nameToIndex.size());
            return nameToIndex.get(name);
        }

        private int solve(int k, int sum, long forbid) {
            if (k == n) return res = Math.max(res, sum);
            if (sum + powerSumFrom[k] <= res) return 0;
            int ans = solve(k + 1, sum, forbid);
            if (((forbid >> k) & 1) == 0) ans = Math.max(ans, solve(k + 1, sum + power[k], forbid | adj[k]));
            return ans;
        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
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

    }

    static class LightWriter implements AutoCloseable {
        private final Writer out;
        private boolean autoflush = false;
        private boolean breaked = true;

        public LightWriter(Writer out) {
            this.out = out;
        }

        public LightWriter(OutputStream out) {
            this(new BufferedWriter(new OutputStreamWriter(out, Charset.defaultCharset())));
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
}


