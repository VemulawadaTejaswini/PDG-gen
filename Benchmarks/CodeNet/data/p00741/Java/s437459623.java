import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static int h;
    private static int w;
    private static boolean[][] land;

    private static boolean dfs(int x, int y) {
        if(!land[x][y]) return false;

        land[x][y] = false;
        for(int dx = -1; dx <= 1; dx++) {
            for(int dy = -1; dy <= 1; dy++) {
                int nx = x + dx;
                int ny = y + dy;
                if(0 <= nx && nx < h && 0 <= ny && ny < w) dfs(nx, ny);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            w = sc.nextInt();
            h = sc.nextInt();
            if(w == 0 && h == 0) break;

            land = new boolean[h][w];
            for(int i = 0; i < h; i++) {
                for(int j = 0; j < w; j++) {
                    int tmp = sc.nextInt();
                    land[i][j] = tmp == 1;
                }
            }

            int res = 0;
            for(int i = 0; i < h; i++) {
                for(int j = 0; j < w; j++) {
                    if(dfs(i, j)) res++;
                }
            }
            System.out.println(res);
        }

        sc.close();
    }
}
