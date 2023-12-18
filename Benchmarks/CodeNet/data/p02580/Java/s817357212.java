import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author New User
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
        public void solve(int testNumber, InputReader c, OutputWriter w) {
            int n = c.readInt(), m = c.readInt(), t = c.readInt();

            int[] nn = new int[n], mm = new int[m];
            HashSet<Pair<Integer, Integer>> hh = new HashSet<>();
            for (int i = 0; i < t; i++) {
                int u = c.readInt() - 1, v = c.readInt() - 1;
                hh.add(new Pair<>(u, v));
                nn[u]++;
                mm[v]++;
            }

            ArrayList<Pair<Integer, Integer>> aa = new ArrayList<>(), bb = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                aa.add(new Pair<>(nn[i], i));
            }
            for (int i = 0; i < m; i++) {
                bb.add(new Pair<>(mm[i], i));
            }
            Collections.sort(aa);
            Collections.sort(bb);

            ArrayList<Integer> a1 = new ArrayList<>(), b1 = new ArrayList<>();

            for (int i = n - 1; i >= 0; i--) {
                if (aa.get(i).first.equals(aa.get(n - 1).first)) {
                    a1.add(aa.get(i).second);
                }
            }
            for (int i = m - 1; i >= 0; i--) {
                if (bb.get(i).first.equals(bb.get(m - 1).first)) {
                    b1.add(bb.get(i).second);
                }
            }


            int res = aa.get(n - 1).first + bb.get(m - 1).first;
            for (int xx : a1) {
                for (int yy : b1) {
                    if (!hh.contains(new Pair<>(xx, yy))) {
                        w.printLine(res);
                        return;
                    }
                }
            }


            w.printLine(res - 1);

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

        public int readInt() {
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

        public void printLine(int i) {
            writer.println(i);
        }

    }

    static class Pair<U, V> implements Comparable<Pair<U, V>> {
        public final U first;
        public final V second;

        public Pair(U first, V second) {
            this.first = first;
            this.second = second;
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return first.equals(pair.first) &&
                    second.equals(pair.second);
        }

        public int hashCode() {
            return Objects.hash(first, second);
        }

        public String toString() {
            return "(" + first + "," + second + ")";
        }

        public int compareTo(Pair<U, V> o) {
            int value = ((Comparable<U>) first).compareTo(o.first);
            if (value != 0) {
                return value;
            }
            return ((Comparable<V>) second).compareTo(o.second);
        }

    }
}

