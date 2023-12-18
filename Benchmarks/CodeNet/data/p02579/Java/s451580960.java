import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
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
        DWizardInMaze solver = new DWizardInMaze();
        solver.solve(1, in, out);
        out.close();
    }

    static class DWizardInMaze {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int h = in.readInt(), w = in.readInt();
            int ch = in.readInt() - 1, cw = in.readInt() - 1;
            int dh = in.readInt() - 1, dw = in.readInt() - 1;


            String[] grid = in.readStringArray(h);


            int[][] seen = new int[h + 1][w + 1];

            ArrayUtils.fill(seen, Integer.MAX_VALUE);

            ArrayDeque<int[]> queue = new ArrayDeque<>();
            queue.add(new int[]{ch, cw});
            seen[ch][cw] = 0;

            int[] dx = {0, 0, -1, 1};
            int[] dy = {1, -1, 0, 0};

            while (!queue.isEmpty()) {
                int[] cur = queue.poll();

                int cost = seen[cur[0]][cur[1]];

                for (int i = 0; i < 4; ++i) {
                    int x = cur[0] + dx[i];
                    int y = cur[1] + dy[i];
                    if (Math.min(x, y) >= 0 && x < h && y < w && grid[x].charAt(y) == '.' && seen[x][y] > cost) {
                        queue.addFirst(new int[]{x, y});
                        seen[x][y] = cost;
                    }
                }

                for (int i = -2; i < 3; ++i)
                    for (int j = -2; j < 3; ++j) {
                        int x = cur[0] + i;
                        int y = cur[1] + j;
                        if (Math.min(x, y) >= 0 && x < h && y < w && grid[x].charAt(y) == '.' && seen[x][y] > cost + 1) {
                            queue.add(new int[]{x, y});
                            seen[x][y] = cost + 1;
                        }
                    }
            }

            out.printLine(seen[dh][dw] == Integer.MAX_VALUE ? -1 : seen[dh][dw]);


        }

    }

    static class ArrayUtils {
        public static void fill(int[][] array, int value) {
            for (int[] row : array) {
                Arrays.fill(row, value);
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

        public void printLine(int i) {
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

        public String[] readStringArray(int size) {
            String[] array = new String[size];
            for (int i = 0; i < size; i++) {
                array[i] = readString();
            }
            return array;
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

