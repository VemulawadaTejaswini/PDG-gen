import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.io.IOException;
import java.util.HashMap;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
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
        APayToWin solver = new APayToWin();
        solver.solve(1, in, out);
        out.close();
    }

    static class APayToWin {
        private static long[] dp = new long[1_000_000];
        private static Map<Long, Long> minCost = new HashMap<>();

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int testCases = in.ints();
            for (int testCase = 1; testCase <= testCases; testCase++) {
                long n = in.longs(), a = in.longs(), b = in.longs(), c = in.longs(), d = in.longs();
                minCost.clear();
                Arrays.fill(dp, -1);
                dp[0] = 0;
                out.ans(topDown(n, a, b, c, d, 0)).ln().flush();
            }
        }

        private static long bottomUp(int now, long a, long b, long c, long d) {
            if (dp[now] >= 0) return dp[now];
            long ans = now * d;
            ans = Math.min(ans, bottomUp(now / 2, a, b, c, d) + (now % 2) * d + a);
            if (now > 2) ans = Math.min(ans, bottomUp(now / 2 + 1, a, b, c, d) + (2 - now % 2) * d + a);
            ans = Math.min(ans, bottomUp(now / 3, a, b, c, d) + (now % 3) * d + b);
            if (now > 1) ans = Math.min(ans, bottomUp(now / 3 + 1, a, b, c, d) + (3 - now % 3) * d + b);
            ans = Math.min(ans, bottomUp(now / 5, a, b, c, d) + (now % 5) * d + c);
            if (now > 1) ans = Math.min(ans, bottomUp(now / 5 + 1, a, b, c, d) + (5 - now % 5) * d + c);
            return dp[now] = ans;
        }

        private static long topDown(long now, long a, long b, long c, long d, long cost) {
            if (minCost.containsKey(now) && minCost.get(now) <= cost) return Long.MAX_VALUE;
            minCost.put(now, cost);
            if (now < dp.length) {
                return bottomUp((int) now, a, b, c, d) + cost;
            }

            long ans = Math.min((Long.MAX_VALUE - cost) / d, now) * d + cost;

            ans = Math.min(ans, topDown(now / 2, a, b, c, d, cost + (now % 2) * d + a));
            if (now > 2) ans = Math.min(ans, topDown(now / 2 + 1, a, b, c, d, cost + (2 - now % 2) * d + a));

            ans = Math.min(ans, topDown(now / 3, a, b, c, d, cost + (now % 3) * d + b));
            if (now > 1) ans = Math.min(ans, topDown(now / 3 + 1, a, b, c, d, cost + (3 - now % 3) * d + b));

            ans = Math.min(ans, topDown(now / 5, a, b, c, d, cost + (now % 5) * d + c));
            if (now > 1) ans = Math.min(ans, topDown(now / 5 + 1, a, b, c, d, cost + (5 - now % 5) * d + c));
            return ans;
        }

    }

    static class LightScanner implements AutoCloseable {
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

        public long longs() {
            return Long.parseLong(string());
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

        public LightWriter flush() {
            try {
                out.flush();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
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

