import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] map = new char[h][w];
        for (int i = 0; i < h; i++) {
            map[i] = sc.next().toCharArray();
        }

        int[][] dd = new int[][]{{-1, 0}, {0, -1}, {0, 1}, {1, 0}};
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (map[i][j] == '.') continue;

                boolean hasS = false;
                for (int[] d :dd) {
                    int x = i + d[0];
                    int y = j + d[1];
                    if (x >= 0 && x < h && y >= 0 && y< w && map[x][y] == '#') hasS = true;
                }

                if (!hasS) {
                    System.out.println("No");
                    return;
                }
            }
        }

        System.out.println("Yes");

    }
}