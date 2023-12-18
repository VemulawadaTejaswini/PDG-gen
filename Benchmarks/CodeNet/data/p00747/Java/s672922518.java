import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static int MAXDIST = 100000;

    static class Pair {
        int first, second;
        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        Pair plus(Pair p) {
            return new Pair(this.first + p.first, this.second + p.second);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int w = scanner.nextInt(), h = scanner.nextInt();
            if (w == 0 && h == 0) break;

            boolean[][][][] wall = new boolean[h + 2][w + 2][h + 2][w + 2];

            int[][] map = new int[h + 2][w + 2];
            for (int i = 0; i < h + 2; ++i) {
                for (int j = 0; j < w + 2; ++j) {
                    map[i][j] = MAXDIST;
                }
            }

            for (int i = 1; i <= h; ++i) {
                wall[i][0][i][1] = true;
                wall[i][1][i][0] = true;
                wall[i][w][i][w + 1] = true;
                wall[i][w + 1][i][w] = true;
            }

            for (int i = 1; i <= w; ++i) {
                wall[0][i][1][i] = true;
                wall[1][i][0][i] = true;
                wall[h][i][h + 1][i] = true;
                wall[h + 1][i][h][i] = true;
            }

            for (int i = 0; i < h * 2 - 1; ++i) {
                if (i % 2 == 0) {
                    for (int j = 1; j <= w - 1; ++j) {
                        int a = scanner.nextInt();
                        if (a == 1) {
                            wall[i / 2 + 1][j][i / 2 + 1][j + 1] = true;
                            wall[i / 2 + 1][j + 1][i / 2 + 1][j] = true;
                        }
                    }
                } else {
                    for (int j = 1; j <= w; ++j) {
                        int a = scanner.nextInt();
                        if (a == 1) {
                            wall[(i + 1) / 2][j][(i + 1) / 2 + 1][j] = true;
                            wall[(i + 1) / 2 + 1][j][(i + 1) / 2][j] = true;
                        }
                    }
                }
            }

            Queue<Pair> deque = new ArrayDeque<>();
            Pair nowPos = new Pair(1, 1), goalPos = new Pair(h, w);

            Pair[] directs = new Pair[4];
            directs[0] = new Pair(1, 0);
            directs[1] = new Pair(0, 1);
            directs[2] = new Pair(-1, 0);
            directs[3] = new Pair(0, -1);

            deque.add(nowPos);
            map[nowPos.first][nowPos.second] = 1;

            while (deque.size() != 0) {
                Pair pos = deque.remove();
                for (int i = 0; i < 4; ++i) {
                    Pair nextPos = pos.plus(directs[i]);

                    if (!wall[pos.first][pos.second][nextPos.first][nextPos.second] && map[nextPos.first][nextPos.second] > map[pos.first][pos.second] + 1) {
                        map[nextPos.first][nextPos.second] = map[pos.first][pos.second] + 1;
                        deque.add(nextPos);
                    }
                }
            }

            System.out.println((map[h][w] == MAXDIST ? 0 : map[h][w]));
        }
    }
}
