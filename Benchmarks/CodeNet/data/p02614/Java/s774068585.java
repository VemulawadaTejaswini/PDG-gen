import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
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
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();
            int k = in.nextInt();
            char[][] t = new char[h][];
            for (int i = 0; i < h; i++) {
                t[i] = in.nextLine().toCharArray();
            }
            int ans = 0;
            for (int maskRow = 0; maskRow <= 1 << h; maskRow++) {
                for (int maskCol = 0; maskCol <= 1 << w; maskCol++) {
                    int sum = 0;
                    for (int ri = 0; ri < h; ri++) {
                        for (int ci = 0; ci < w; ci++) {
                            if ((maskRow & (1 << ri)) != 0 &&
                                (maskCol & (1 << ci)) != 0
                            ) {
                                sum += t[ri][ci] == '#' ? 1 : 0;
                            }
                        }
                    }
                    if (sum == k) {
                        ans++;
                    }
                }
            }
            out.println(ans);
        }

    }

    static class InputReader {
        final InputStream is;
        final byte[] buffer = new byte[1024];
        int curCharIdx;
        int nChars;

        public InputReader(InputStream is) {
            this.is = is;
        }

        public int read() {
            if (curCharIdx >= nChars) {
                try {
                    curCharIdx = 0;
                    nChars = is.read(buffer);
                    if (nChars == -1) {
                        return -1;
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return buffer[curCharIdx++];
        }

        public int nextInt() {
            int sign = 1;
            int c = skipDelims();
            if (c == '-') {
                sign = -1;
                c = read();
                if (isDelim(c)) {
                    throw new RuntimeException("Incorrect format");
                }
            }
            int val = 0;
            while (c != -1 && !isDelim(c)) {
                if (!isDigit(c)) {
                    throw new RuntimeException("Incorrect format");
                }
                val = 10 * val + (c - '0');
                c = read();
            }
            return val * sign;
        }

        public String nextLine() {
            return nextLine(16);
        }

        public String nextLine(int size) {
            int c = read();
            while (c == '\n' || c == '\t' || c == '\r') {
                c = read();
            }
            if (c == -1) {
                return null;
            }
            StringBuilder sb = new StringBuilder(size);
            while (c != -1 && c != '\n' && c != '\t' && c != '\r') {
                sb.appendCodePoint(c);
                c = read();
            }
            return sb.toString();
        }

        private final int skipDelims() {
            int c = read();
            while (isDelim(c)) {
                c = read();
            }
            return c;
        }

        private static boolean isDelim(final int c) {
            return c == ' ' ||
                   c == '\n' ||
                   c == '\t' ||
                   c == '\r' ||
                   c == '\f';
        }

        private static boolean isDigit(final int c) {
            return '0' <= c && c <= '9';
        }

    }
}

