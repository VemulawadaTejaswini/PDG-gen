import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Seikichi KONDO (seikichi@kmc.gr.jp)
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AOJ0121 solver = new AOJ0121();
        solver.solve(1, in, out);
        out.close();
    }

    static final class AOJ0121 {
        private int[] factorial = {
                1,
                1,
                2,
                2 * 3,
                2 * 3 * 4,
                2 * 3 * 4 * 5,
                2 * 3 * 4 * 5 * 6,
                2 * 3 * 4 * 5 * 6 * 7,
                2 * 3 * 4 * 5 * 6 * 7 * 8,
        };

        @SuppressWarnings("unused")
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            final int H = 2, W = 4;
            final int[] dist = new int[factorial[8]];
            Arrays.fill(dist, -1);

            final Queue<Integer> que = new LinkedList<Integer>();
            final int[][] goalBoard = {{0, 1, 2, 3}, {4, 5, 6, 7}};
            final int goal = encode(goalBoard);
            que.add(goal);
            dist[goal] = 0;

            final int[][] board = new int[H][W];

            while (in.hasNext()) {
                final int[][] startBoard = new int[H][W];
                for (int i = 0; i < H * W; i++) {
                    startBoard[i / W][i % W] = in.nextInt();
                }
                final int start = encode(startBoard);

                // solve
                final int[][] delta = {{+1, 0}, {0, +1}, {-1, 0}, {0, -1}};

                while (dist[start] == -1 && !que.isEmpty()) {
                    final int v = que.remove();
                    decode(v, board);

                    int y = 0, x = 0;
                    for (int i = 0; i < H * W; i++) {
                        if (board[i / W][i % W] == 0) {
                            y = i / W;
                            x = i % W;
                            break;
                        }
                    }

                    for (int[] d : delta) {
                        final int ny = y + d[0];
                        final int nx = x + d[1];
                        if (ny < 0 || H <= ny || nx < 0 || W <= nx) {
                            continue;
                        }

                        board[y][x] = board[ny][nx];
                        board[ny][nx] = 0;
                        final int next = encode(board);
                        if (dist[next] == -1) {
                            que.add(next);
                            dist[next] = dist[v] + 1;
                        }
                        board[ny][nx] = board[y][x];
                        board[y][x] = 0;
                    }
                }

                out.println(dist[start]);
            }
        }

        private int encode(int[][] board) {
            int result = 0;
            final int[] vs = {0, 1, 2, 3, 4, 5, 6, 7};
            for (int i = 0; i < 8 - 1; i++) {
                final int v = board[i / 4][i % 4];
                for (int j = 0; j < vs.length; j++) {
                    if (v != vs[j]) {
                        continue;
                    }

                    result += j * factorial[8 - i - 1];
                    for (int k = j; k < 8 - 1 - i; k++) {
                        vs[k] = vs[k + 1];
                    }
                    break;
                }
            }
            return result;
        }

        private void decode(int v, int[][] board) {
            final int[] vs = {0, 1, 2, 3, 4, 5, 6, 7};
            for (int i = 0; i < 8 - 1; i++) {
                int x = v / factorial[8 - i - 1];
                board[i / 4][i % 4] = vs[x];
                for (int j = x; j < 8 - 1 - i; j++) {
                    vs[j] = vs[j + 1];
                }
                v %= factorial[8 - i - 1];
            }
            board[1][3] = vs[0];
        }

    }

    static final class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        public FastScanner(InputStream in) {
            this.in = in;
        }

        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        private void skipUnprintable() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        }

        public boolean hasNext() {
            skipUnprintable();
            return hasNextByte();
        }

        public int nextInt() {
            if (!hasNext()) throw new NoSuchElementException();
            int n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) {
                throw new NumberFormatException();
            }
            while (true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }

    }
}