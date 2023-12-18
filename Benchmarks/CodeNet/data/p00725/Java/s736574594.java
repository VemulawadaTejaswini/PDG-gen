import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            byte sx = 0, sy = 0;
            byte w = (byte) sc.nextInt();
            byte h = (byte) sc.nextInt();
            if (w == 0 && h == 0) break;
            byte[][] board = new byte[w][h];//x座標,y座標の順番
            for (byte i = 0; i < h; i++) {
                for (byte j = 0; j < w; j++) {
                    board[j][i] = (byte) sc.nextInt();
                    if (board[j][i] == 2) {
                        sx = j;
                        sy = i;
                        board[j][i] = 0;
                    }
                }
            }
            System.out.println(solve(w, h, board, sx, sy));
        }
    }

    private static byte solve(byte w, byte h, byte[][] board, byte sx, byte sy) {
        Queue<byte[][]> que_board = new ArrayDeque<>();
        Queue<byte[]> que_info = new ArrayDeque<>();
        byte[] info = {0, sx, sy};
        que_board.add(board);
        que_info.add(info);
        byte[][] move = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        while (!que_board.isEmpty()) {
            byte[][] b_board = que_board.remove();
            byte[] b_info = que_info.remove();
            if (b_info[0] >= 10) break;
            for (byte[] dir : move) {
                byte[][] a_board = new byte[w][h];
                for (byte i = 0; i < w; i++) {
                    for (byte j = 0; j < h; j++) {
                        a_board[i][j] = (byte) (b_board[i][j] + 0);
                    }
                }
                byte[] a_info = b_info.clone();
                byte x = (byte) (a_info[1] + dir[0]);
                byte y = (byte) (a_info[2] + dir[1]);
                if (0 <= x && x < w
                        && 0 <= y && y < h) {
                    if (a_board[x][y] != 1) {
                        while (true) {
                            if (0 <= x && x < w
                                    && 0 <= y && y < h) {
                                if (a_board[x][y] == 0) {
                                    a_info[1] += dir[0];
                                    a_info[2] += dir[1];
                                    x += dir[0];
                                    y += dir[1];
                                } else if (a_board[x][y] == 1) {
                                    a_board[x][y] = 0;
                                    a_info[0] += 1;
                                    que_board.add(a_board);
                                    que_info.add(a_info);
                                    break;
                                } else if (a_board[x][y] == 3) {
                                    return (byte) (a_info[0] + 1);
                                }
                            } else break;
                        }
                    }
                }
            }
        }
        return -1;
    }
}

