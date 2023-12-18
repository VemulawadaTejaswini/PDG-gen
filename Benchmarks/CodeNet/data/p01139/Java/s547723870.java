import java.util.Scanner;

class Main {
    private static void mark(int x, int y, int flag, char[][] data, int[][] map) {
        for (int i = x + 1; i < data.length; i++) {
            if (data[i][y] == '.' && (map[i][y] & flag) == 0) {
                map[i][y] |= flag;
                mark(i, y, flag, data, map);
            } else {
                break;
            }
        }
        for (int i = x - 1; i >= 0; i--) {
            if (data[i][y] == '.' && (map[i][y] & flag) == 0) {
                map[i][y] |= flag;
                mark(i, y, flag, data, map);
            } else {
                break;
            }
        }
        for (int j = y + 1; j < data[0].length; j++) {
            if (data[x][j] == '.' && (map[x][j] & flag) == 0) {
                map[x][j] |= flag;
                mark(x, j, flag, data, map);
            } else {
                break;
            }
        }
        for (int j = y - 1; j >= 0; j--) {
            if (data[x][j] == '.' && (map[x][j] & flag) == 0) {
                map[x][j] |= flag;
                mark(x, j, flag, data, map);
            } else {
                break;
            }
        }
    }

    private static void solve() {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            final int w = scanner.nextInt();
            final int h = scanner.nextInt();
            if (w == 0 && h == 0) {
                break;
            }

            final char[][] data = new char[h][];
            final int[][] map = new int[h][w];
            for (int i = 0; i < h; i++) {
                    data[i] = scanner.next().toCharArray();
            }
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    switch (data[i][j]) {
                        case 'B':
                            mark(i, j, 0x1, data, map);
                            break;
                        case 'W':
                            mark(i, j, 0x2, data, map);
                            break;
                        default:
                            break;
                    }
                }
            }
            int black = 0;
            int white = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    switch (map[i][j]) {
                        case 0x1:
                            black++;
                            break;
                        case 0x2:
                            white++;
                            break;
                        default:
                            break;
                    }
                }
            }
            System.out.println(black + " " + white);
        }
    }

    public static void main(String... args) {
        solve();
    }
}