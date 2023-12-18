import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] field = new char[h][];
        int[][] map = new int[h * w][h * w];
        for(int i = 0; i < h * w; i++) {
            Arrays.fill(map[i], Integer.MAX_VALUE / 10);
            map[i][i] = 0;
        }
        for (int i = 0; i < h; i++) {
            field[i] = sc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                if (j != 0 && field[i][j - 1] == '.' && field[i][j] == '.') {
                    map[i * w + j][i * w + j - 1] = 1;
                    map[i * w + j - 1][i * w + j] = 1;
                }
                if (i != 0 && field[i - 1][j] == '.' && field[i][j] == '.') {
                    map[(i - 1) * w + j][i * w + j] = 1;
                    map[i * w + j][(i - 1) * w + j] = 1;
                }
            }
        }
        for (int i = 0; i < h * w; i++) {
            for (int j = 0; j < h * w; j++) {
                for (int k = 0; k < h * w; k++) {
                    map[j][k] = Math.min(map[j][k], map[j][i] + map[i][k]);
                    map[k][j] = map[j][k];
                }
            }
        }
        int max = 0;
        for (int i = 0; i < h * w; i++) {
            for (int j = 0; j < h * w; j++) {
                if (map[i][j] < Integer.MAX_VALUE / 10) {
                    max = Math.max(max, map[i][j]);
                }
            }
        }
        System.out.println(max);
    }
}