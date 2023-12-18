import java.io.*;
import java.util.*;

public class Main {

    void run() {
        while (true) {
            int N = readInt();
            int M = readInt();
            int P = readInt();
            if (N == 0 && M == 0 && P == 0) {
                break;
            }
            int[][] play = new int[P][2];
            for (int i = 0; i < P; i++) {
                play[i][0] = readInt() - 1;
                play[i][1] = readInt() - 1;
            }
            int[][] level = new int[N][N];
            int[][][] color = new int[N][N][N];
            int now = 1;
            int winner = 0;
            int turn = -1;
            for (int i = 0; i < P; i++) {
                int x = play[i][0];
                int y = play[i][1];
                color[x][y][level[x][y]++] = now;

                sysout.println("turn " + (i + 1));

                for (int a = 0; a < N; a++) {
                    for (int b = 0; b < N; b++) {
                        for (int c = 0; c < N; c++) {
                            sysout.print(" " + color[b][c][a]);
                        }
                        sysout.println();
                    }
                    sysout.println();
                }

                sysout.println("=====");

                boolean end = false;

                for (int a = 0; a < N; a++) {
                    for (int b = 0; b < N; b++) {
                        for (int c = 0; c < N - M + 1; c++) {
                            if (color[a][b][c] == 0) continue;

                            boolean flag = true;
                            for (int d = 0; d < M; d++) {
                                if (color[a][b][c + d] != color[a][b][c]) flag = false;
                            }
                            if (flag) {
                                end = true;
                            }
                        }
                    }
                }

                for (int a = 0; a < N; a++) {
                    for (int b = 0; b < N - M + 1; b++) {
                        for (int c = 0; c < N; c++) {
                            if (color[a][b][c] == 0) continue;

                            boolean flag = true;
                            for (int d = 0; d < M; d++) {
                                if (color[a][b + d][c] != color[a][b][c]) flag = false;
                            }
                            if (flag) {
                                end = true;
                            }
                        }
                    }
                }

                for (int a = 0; a < N - M + 1; a++) {
                    for (int b = 0; b < N; b++) {
                        for (int c = 0; c < N; c++) {
                            if (color[a][b][c] == 0) continue;

                            boolean flag = true;
                            for (int d = 0; d < M; d++) {
                                if (color[a + d][b][c] != color[a][b][c]) flag = false;
                            }
                            if (flag) {
                                end = true;
                            }
                        }
                    }
                }

                if (end) {
                    winner = now;
                    turn = i + 1;
                    break;
                }

                now *= -1;
            }
            if (winner == 0) {
                sysout.println("Draw");
            } else {
                sysout.println((winner == 1 ? "Black" : "White") + " " + turn);
            }
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }

    // flush automatically iff you call `println` or `printf` or `format`.
    PrintWriter sysout = new PrintWriter(System.out, true);

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer buffer = new StringTokenizer("");

    String read() {
        if (!buffer.hasMoreTokens()) {
            try {
                buffer = new StringTokenizer(in.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return buffer.nextToken();
    }

    int readInt() {
        return Integer.parseInt(read());
    }

    long readLong() {
        return Long.parseLong(read());
    }

    double readDouble() {
        return Double.parseDouble(read());
    }

    String readLine() {
        buffer = new StringTokenizer("");
        try {
            return in.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}