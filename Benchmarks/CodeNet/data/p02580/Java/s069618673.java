import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.OptionalInt;
import java.util.ArrayList;
import java.io.BufferedOutputStream;
import java.util.HashSet;
import java.io.UncheckedIOException;
import java.util.List;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.util.NoSuchElementException;
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
        EBomber solver = new EBomber();
        solver.solve(1, in, out);
        out.close();
    }

    static class EBomber {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int h = in.ints(), w = in.ints(), m = in.ints();
            int[] c1 = new int[h], c2 = new int[w];
            HashSet<EBomber.P> set = new HashSet<>();
            List<Integer> cols = new ArrayList<>(), rows = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                int x = in.ints() - 1, y = in.ints() - 1;
                c1[x]++;
                c2[y]++;
                set.add(new EBomber.P(x, y));
            }
            int rmax = IntMath.max(c1);
            int cmax = IntMath.max(c2);
            for (int i = 0; i < h; i++) {
                if (c1[i] == rmax) rows.add(i);
            }
            for (int i = 0; i < w; i++) {
                if (c2[i] == cmax) cols.add(i);
            }
            if (cols.size() * (long) rows.size() > m) {
                out.ans(cmax + rmax).ln();
                return;
            }
            EBomber.P p = new EBomber.P(0, 0);
            for (int c : cols) {
                p.y = c;
                for (int r : rows) {
                    p.x = r;
                    if (!set.contains(p)) {
                        out.ans(cmax + rmax).ln();
                        return;
                    }
                }
            }
            out.ans(cmax + rmax - 1).ln();
        }

        private static class P {
            int x;
            int y;

            P(int x, int y) {
                this.x = x;
                this.y = y;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;

                EBomber.P p = (EBomber.P) o;

                if (x != p.x) return false;
                return y == p.y;
            }

            public int hashCode() {
                int result = x;
                result = 31 * result + y;
                return result;
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

    static final class IntMath {
        private IntMath() {
        }

        public static int max(int... v) {
            return Arrays.stream(v).max().orElseThrow(NoSuchElementException::new);
        }

    }
}

