import java.util.*;
import static java.lang.Math.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    int h;
    int w;
    int k;
    String[][] grid;

    private void run() {
        h = sc.nextInt();
        w = sc.nextInt();
        k = sc.nextInt();
        grid = new String[h][w];

        for (int i = 0; i < h; i++) {
            grid[i] = sc.next().split("");
        }

        // 全探索
        int ans = 0;
        for (int rows = 0; rows < 1 << h; rows++) {
            for (int cols = 0; cols < 1 << w; cols++) {
                int black = 0;
                for (int i = 0; i < h; i++) {
                    if ((1 & rows >> i) == 1) continue;
                    for (int j = 0; j < w; j++) {
                        if ((1 & cols >> j) == 1) continue;
                        if (grid[i][j].equals("#")) black++;
                    }
                }
                if (black == k) ans++;
            }
        }
        System.out.println(ans);
    }
}
