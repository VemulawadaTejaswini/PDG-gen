
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int h = in.nextInt();
        final int w = in.nextInt();
        final char[][] map = new char[h][w];
        for (int i = 0; i < h; i++) {
            final String line = in.next();
            map[i] = line.toCharArray();
        }

        final int[][] horizontal = new int[h][w];
        final int[][] vertical = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (map[i][j] == '#') {
                    if (j > 0) {
                        final int sum = horizontal[i][j - 1];
                        for (int k = j - 1; k > j - 1 - sum; --k) {
                            horizontal[i][k] = sum;
                        }
                    }
                    if (i > 0) {
                        final int sum = vertical[i - 1][j];
                        for (int k = i - 1; k > i - 1 - sum; --k) {
                            vertical[k][j] = sum;
                        }
                    }

                } else if (map[i][j] == '.') {
                    if (j > 0) {
                        horizontal[i][j] = horizontal[i][j - 1] + 1;
                    } else {
                        horizontal[i][j] = 1;
                    }

                    if (i > 0) {
                        vertical[i][j] = vertical[i - 1][j] + 1;
                    } else {
                        vertical[i][j] = 1;
                    }
                }
            }
            final int sum = horizontal[i][w - 1];
            for (int k = w - 1; k > w - 1 - sum; --k) {
                horizontal[i][k] = sum;
            }
        }
        for (int i = 0; i < w; i++) {
            final int sum = vertical[h - 1][i];
            for (int k = h - 1; k > h - 1 - sum; --k) {
                vertical[k][i] = sum;
            }
        }

        int max = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                max = Math.max(max, vertical[i][j] + horizontal[i][j]);
            }
        }
        System.out.println(max-1);
    }
}
