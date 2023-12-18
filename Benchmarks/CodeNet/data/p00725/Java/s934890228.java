import java.util.*;

public class Main {
    static final int[] dx = {0, 1, 0, -1}, dy = {1, 0, -1, 0};
    static ArrayDeque<Board> que = new ArrayDeque<>();

    static class Board {
        int[][] board;
        int x, y, cnt;

        Board(int[][] b, int x, int y, int cnt) {
            board = new int[b.length][];
            for (int i = 0; i < b.length; ++i) {
                board[i] = new int[b[i].length];
                System.arraycopy(b[i], 0, board[i], 0, b[i].length);
            }
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int w, h;
        while (true) {
            w = scanner.nextInt();
            h = scanner.nextInt();

            if (w == 0 && h == 0) break;

            int[][] board = new int[h][w];
            int sx = 0, sy = 0, ans = 100;

            for (int i = 0; i < h; ++i) {
                for (int j = 0; j < w; ++j) {
                    board[i][j] = scanner.nextInt();
                    if (board[i][j] == 2) {
                        sx = j;
                        sy = i;
                    }
                }
            }

            que.push(new Board(board, sx, sy, 0));
            while (!que.isEmpty()) {
                Board b = que.poll();
                for (int i = 0; i < 4; ++i) {
                    for (int j = 1; j <= 20; ++j) {
                        int nx = b.x + j * dx[i], ny = b.y + j * dy[i];
                        if (nx < 0 || nx >= w || ny < 0 || ny >= h) break;

                        int bx = nx - dx[i], by = ny - dy[i];
                        if (b.board[ny][nx] == 1) {
                            b.board[ny][nx] = 0;
                            if ((bx != b.x || by != b.y) && b.cnt < 10) que.push(new Board(b.board, bx, by, b.cnt + 1));
                            b.board[ny][nx] = 1;
                            break;
                        } else if (b.board[ny][nx] == 3) {
                            ans = Math.min(ans, b.cnt + 1);
                        }
                    }
                }
            }

            System.out.println((ans > 10 ? -1 : ans));
        }
    }
}
