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
        AIntegerProduct solver = new AIntegerProduct();
        solver.solve(1, in, out);
        out.close();
    }

    static class AIntegerProduct {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                String[] s = in.string().split("\\.");
                if (s.length == 2) {
                    a[i] = Long.parseLong(s[1]);
                    int len = s[1].length();
                    for (int j = len; j < 9; j++) {
                        a[i] *= 10;
                    }
                }
                a[i] += Long.parseLong(s[0]) * 1_000_000_000L;
            }
            int[][] tbl = new int[20][20];
            long ans = 0;
            for (int i = 0; i < n; i++) {
                int c2 = 0, c5 = 0;
                while (a[i] % 2 == 0) {
                    a[i] /= 2;
                    c2++;
                }
                while (a[i] % 5 == 0) {
                    a[i] /= 5;
                    c5++;
                }
                for (int j = 18 - c2; j < 20; j++) {
                    for (int k = 18 - c5; k < 20; k++) {
                        ans += tbl[j][k];
                    }
                }
                tbl[c2][c5]++;
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

        public void close() {
            try {
                out.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }
}

