import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.TreeSet;
import java.util.ArrayList;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        EBomber solver = new EBomber();
        solver.solve(1, in, out);
        out.close();
    }

    static class EBomber {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int ntc = 1;
//        ntc = in.nextInt();
            while ((ntc--) > 0) {
                int n = in.nextInt();
                int m = in.nextInt();
                int w = in.nextInt();
                ArrayList<_C.Pair<Integer, Integer>> rowp = new ArrayList<>();
                ArrayList<_C.Pair<Integer, Integer>> colp = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    rowp.add(new _C.Pair<>(i, 0));
                }
                for (int i = 0; i < m; i++) {
                    colp.add(new _C.Pair<>(i, 0));
                }
                int max = 0;
                TreeSet<String> hs = new TreeSet<>();
                while (w-- > 0) {
                    int x = in.nextInt() - 1;
                    int y = in.nextInt() - 1;
                    hs.add((x + " " + y));
                    rowp.get(x).s++;
                    colp.get(y).s++;
                }
                Collections.sort(rowp, (a, b) -> {
                    return b.s - a.s;
                });
                Collections.sort(colp, (a, b) -> {
                    return b.s - a.s;
                });
                int a = rowp.get(0).s;
                int idx = rowp.get(0).f;
                for (int i = 0; i < m; i++) {
                    if (hs.contains(idx + " " + colp.get(i).f)) {
                        max = Math.max(colp.get(i).s + a - 1, max);
                    } else {
                        max = Math.max(colp.get(i).s + a, max);
                    }
                }
                a = colp.get(0).s;
                idx = colp.get(0).f;
                for (int i = 0; i < n; i++) {
                    if (hs.contains(rowp.get(i).f + " " + idx)) {
                        max = Math.max(rowp.get(i).s + a - 1, max);
                    } else {
                        max = Math.max(rowp.get(i).s + a, max);
                    }
                }
                out.println(max);
            }
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

    static class _C {
        static public class Pair<F extends Comparable<F>, S extends Comparable<S>> implements Comparable<_C.Pair<F, S>> {
            public F f;
            public S s;

            public Pair(F f, S s) {
                this.f = f;
                this.s = s;
            }

            public int compareTo(_C.Pair<F, S> o) {
                int t = f.compareTo(o.f);
                if (t == 0) return s.compareTo(o.s);
                return t;
            }

            public int hashCode() {
                return (31 + f.hashCode()) * 31 + s.hashCode();
            }

            public boolean equals(Object o) {
                if (!(o instanceof _C.Pair)) return false;
                if (o == this) return true;
                _C.Pair p = (_C.Pair) o;
                return f.equals(p.f) && s.equals(p.s);
            }

            public String toString() {
                return "{" + f + ", " + s + "}";
            }

        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

        public void println(long i) {
            writer.println(i);
        }

    }
}

