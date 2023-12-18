import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
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
        DAnythingGoesToZero solver = new DAnythingGoesToZero();
        solver.solve(1, in, out);
        out.close();
    }

    static class DAnythingGoesToZero {
        public void solve(int testNumber, InputReader c, OutputWriter w) {
            int n = c.readInt();
            char[] s = c.readString().toCharArray();
            int set = 0;
            for (int i = 0; i < n; i++) {
                if (s[i] == '1') {
                    set++;
                }
            }

            int res[] = new int[n];
            if (set != n) {
                long cur_power[] = new long[n];
                long setp1 = 0, cur_power_2 = 1;
                set++;
                for (int i = n - 1; i >= 0; i--) {
                    setp1 += ((s[i] - '0') * cur_power_2) % set;
                    cur_power[i] = cur_power_2;
                    cur_power_2 = (cur_power_2 * 2) % set;
                    setp1 %= set;
                }
                for (int i = 0; i < n; i++) {
                    if (s[i] == '0') {
                        res[i] = get((setp1 + cur_power[i]) % set);
                    }
                }
                set--;
            }
            if (set > 1) {
                long cur_power[] = new long[n];
                long setp1 = 0, cur_power_2 = 1;
                set--;
                for (int i = n - 1; i >= 0; i--) {
                    setp1 += ((s[i] - '0') * cur_power_2) % set;
                    cur_power[i] = cur_power_2;
                    cur_power_2 = (cur_power_2 * 2) % set;
                    setp1 %= set;
                }
                for (int i = 0; i < n; i++) {
                    if (s[i] == '1') {
                        long new_set = (setp1 - cur_power[i] + set) % set;
                        res[i] = get(new_set);
                    }
                }
                set++;
            }
            if (set == 1) {
                for (int i = 0; i < n; i++) {
                    if (s[i] == '1') {
                        res[i] = 0;
                    }
                }
            }
            w.printLine(res);

        }

        private int get(long l) {
            int res = 0;
            while (l != 0) {
                l = l % bitCountt(l);
                res++;
            }
            return res + 1;
        }

        private long bitCountt(long l) {
            long res = 0;
            for (int i = 0; i < 30; i++) {
                if (((1 << i) & l) > 0) {
                    res++;
                }
            }
            return res;
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

        public void print(int[] array) {
            for (int i = 0; i < array.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(array[i]);
            }
        }

        public void printLine(int[] array) {
            print(array);
            writer.println();
        }

        public void close() {
            writer.close();
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

        public String readString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                if (Character.isValidCodePoint(c)) {
                    res.appendCodePoint(c);
                }
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
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
}

