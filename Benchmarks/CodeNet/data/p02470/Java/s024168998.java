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
import java.util.Map.Entry;
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
        NTL_1_D solver = new NTL_1_D();
        solver.solve(1, in, out);
        out.close();
    }

    static class NTL_1_D {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            long n = in.longs();
            out.ansln(IntMath.totient(n));
        }

    }

    static final class IntMath {
        private IntMath() {
        }

        public static Map<Long, Integer> primeFactorize(long p) {
            Map<Long, Integer> factor = new HashMap<>();
            if ((p & 1) == 0) {
                int c = 0;
                do {
                    c++;
                    p >>= 1;
                } while ((p & 1) == 0);
                factor.put(2L, c);
            }
            for (long i = 3; i * i <= p; i += 2) {
                if (p % i == 0) {
                    int c = 0;
                    do {
                        c++;
                        p /= i;
                    } while ((p % i) == 0);
                    factor.put(i, c);
                }
            }
            if (p > 1) {
                factor.put(p, 1);
            }
            return factor;
        }

        public static long primeTotient(long p, int c) {
            long ans = p - 1;
            for (int i = 1; i < c; i++) {
                ans *= p;
            }
            return ans;
        }

        public static long totient(long v) {
            Map<Long, Integer> factors = primeFactorize(v);
            long ans = 1;
            for (Map.Entry<Long, Integer> ent : factors.entrySet()) {
                ans *= primeTotient(ent.getKey(), ent.getValue());
            }
            return ans;
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

        public LightWriter ans(long l) {
            return ans(Long.toString(l));
        }

        public LightWriter ansln(long... n) {
            for (long n1 : n) {
                ans(n1).ln();
            }
            return this;
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

        public long longs() {
            return Long.parseLong(string());
        }

    }
}


