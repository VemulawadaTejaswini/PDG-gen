import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();

        char[][] array = new char[h][];
        Arrays.setAll(array, i -> scanner.next().toCharArray());

        int[][] l = new int[h][w];
        int[][] r = new int[h][w];
        int[][] u = new int[h][w];
        int[][] d = new int[h][w];

        // 左メモ
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (array[i][j] == '#') {
                    l[i][j] = 0;
                } else if (j == 0) {
                    l[i][j] = 1;
                } else {
                    l[i][j] = l[i][j - 1] + 1;
                }
            }
        }

        // 右メモ
        for (int i = 0; i < h; i++) {
            for (int j = w - 1; j >= 0; j--) {
                if (array[i][j] == '#') {
                    r[i][j] = 0;
                } else if (j == w - 1) {
                    r[i][j] = 1;
                } else {
                    r[i][j] = r[i][j + 1] + 1;
                }
            }
        }

        // 上メモ
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                if (array[j][i] == '#') {
                    u[j][i] = 0;
                } else if (j == 0) {
                    u[j][i] = 1;
                } else {
                    u[j][i] = u[j - 1][i] + 1;
                }
            }
        }

        // 下メモ
        for (int i = 0; i < w; i++) {
            for (int j = h - 1; j >= 0; j--) {
                if (array[j][i] == '#') {
                    d[j][i] = 0;
                } else if (j == h - 1) {
                    d[j][i] = 1;
                } else {
                    d[j][i] = d[j + 1][i] + 1;
                }
            }
        }

        int ans = 0;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                ans = Math.max(ans, u[i][j] + d[i][j] + l[i][j] + r[i][j] - 3);
            }
        }

        System.out.println(ans);
    }
}