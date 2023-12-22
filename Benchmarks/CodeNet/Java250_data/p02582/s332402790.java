import java.io.*;
import java.util.InputMismatchException;

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
        ARainySeasonEditorial solver = new ARainySeasonEditorial();
        solver.solve(1, in, out);
        out.close();
    }

    static class ARainySeasonEditorial {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            String str = in.next();
            Character left = str.charAt(0);
            Character middle = str.charAt(1);
            Character right = str.charAt(2);
            if (left.charValue() == 'R' && middle.charValue() == 'R'
                    && right.charValue() == 'R') {
                out.println(3);
            } else if ((left.charValue() == 'R' && middle.charValue() == 'R' && right.charValue() == 'S')
                    || (middle.charValue() == 'R' && right.charValue() == 'R' && left.charValue() == 'S')) {
                out.println(2);
            } else if ((left.charValue() == 'R' && middle.charValue() == 'S' && right.charValue() == 'S')
                    || (left.charValue() == 'S' && middle.charValue() == 'R' && right.charValue() == 'S')
                    || (left.charValue() == 'S' && middle.charValue() == 'S' && right.charValue() == 'R')
                    || (left.charValue() == 'R' && right.charValue() == 'R' && middle.charValue() == 'S')) {
                out.println(1);
            } else if (left.charValue() == 'S' && middle.charValue() == 'S' && right.charValue() == 'S') {
                out.println(0);
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

        public void println(int i) {
            writer.println(i);
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

        public String nextString() {
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

        public String next() {
            return nextString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

