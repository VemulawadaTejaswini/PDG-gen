import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.stream.IntStream;
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
        EOrand solver = new EOrand();
        solver.solve(1, in, out);
        out.close();
    }

    static class EOrand {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n, max, m = 0;
            int[] a;
            {
                int n0 = in.ints();
                max = in.ints();
                int s = in.ints(), t = in.ints();
                int[] a0 = in.ints(n0);
                if ((s & ~t) != 0) {
                    out.ans(0).ln();
                    return;
                }
                a = new int[n0];
                n = 0;
                for (int i = 0; i < 18; i++) {
                    if (((s >> i) & 1) == 1 || ((t >> i) & 1) == 0) continue;
                    m++;
                }
                for (int i = 0; i < n0; i++) {
                    if ((a0[i] & s) != s || (a0[i] | t) != t) continue;
                    int tmp = 0, bit = 1;
                    for (int j = 0; j < 18; j++) {
                        if (((s >> j) & 1) == 1 || ((t >> j) & 1) == 0) continue;
                        if (((a0[i] >> j) & 1) == 1) tmp |= bit;
                        bit <<= 1;
                    }
                    a[n++] = tmp;
                }
            }

            long ans = 0;
        /*
        int ans = 0, all = (1 << m) - 1;
        for (int i = 1; i < (1 << n); i++) {
            int or = 0, and = all, cnt = 0;
            for (int j = 0; j < n; j++) {
                if (((i >> j) & 1) == 0) continue;
                cnt++;
                or |= a[j];
                and &= a[j];
            }
            if (cnt <= k && or == all && and == 0) ans++;
        }*/

            int all = 1 << m;
            long[][][] dp = new long[n][max + 1][all];
            for (int i = 0; i < n; i++) {
                ArrayUtil.fill(dp, 0);
                dp[i][1][0] = 1;
                for (int j = i + 1; j < n; j++) {
                    int d = a[i] ^ a[j];
                    for (int k = 0; k <= max; k++) System.arraycopy(dp[j - 1][k], 0, dp[j][k], 0, all);
                    for (int k = 0; k < max; k++) {
                        for (int l = 0; l < all; l++) {
                            dp[j][k + 1][l | d] += dp[j - 1][k][l];
                        }
                    }
                }
                for (int j = 0; j <= max; j++) ans += dp[n - 1][j][all - 1];
            }
            out.ans(ans).ln();
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

        public int[] ints(int length) {
            return IntStream.range(0, length).map(x -> ints()).toArray();
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

    static final class ArrayUtil {
        private ArrayUtil() {
        }

        public static void fill(long[] a, long v) {
            Arrays.fill(a, v);
        }

        public static void fill(long[][] a, long v) {
            for (int i = 0; i < a.length; i++) {
                fill(a[i], v);
            }
        }

        public static void fill(long[][][] a, long v) {
            for (int i = 0; i < a.length; i++) {
                fill(a[i], v);
            }
        }

    }
}

