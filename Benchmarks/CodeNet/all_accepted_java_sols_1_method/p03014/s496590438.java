import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next()), w = Integer.parseInt(sc.next());
        boolean[][] s = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            String str = sc.next();
            for (int j = 0; j < w; j++) {
                if ('.' == str.charAt(j)) {
                    s[i][j] = true;
                }
            }
        }

        int[][] l = new int[h][w];
        int[][] r = new int[h][w];
        int[][] u = new int[h][w];
        int[][] d = new int[h][w];

        for (int j = 0; j < w; j++) {
            for (int i = 0; i < h; i++) {
                if (s[i][j]) {
                    if (j == 0) {
                        l[i][j] = 1;
                    } else {
                        l[i][j] = l[i][j - 1] + 1;
                    }
                }
                if (s[i][w - 1 - j]) {
                    if (j == 0) {
                        r[i][w - 1 - j] = 1;
                    } else {
                        r[i][w - 1 - j] = r[i][w - j] + 1;
                    }
                }
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (s[i][j]) {
                    if (i == 0) {
                        d[i][j] = 1;
                    } else {
                        d[i][j] = d[i - 1][j] + 1;
                    }
                }
                if (s[h - 1 - i][j]) {
                    if (i == 0) {
                        u[h - 1 - i][j] = 1;
                    } else {
                        u[h - 1 - i][j] = u[h - i][j] + 1;
                    }
                }
            }
        }

        int result = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                result = Math.max(result, l[i][j] + r[i][j] + d[i][j] + u[i][j] - 3);
            }
        }

        System.out.println(result);

    }
}
