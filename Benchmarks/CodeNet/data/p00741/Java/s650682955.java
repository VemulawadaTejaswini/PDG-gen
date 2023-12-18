import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by YuyaKita on 2015/05/18.
 */
public class Main {
    static final int MAX_W = 50, MAX_H = 50;
    static int W, H;
    static int[][] world = new int[MAX_H + 1][MAX_W + 1];
    static int count = 0;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static void main(String args[]) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        while (true) {
            W = sc.nextInt();
            H = sc.nextInt();
            if (W == 0 && H == 0){

                break;
            }
            for (int i = 0; i < H; i++) {
                for(int j = 0;j<W;j++){
                    world[i][j] = sc.nextInt();
                }
            }

            System.out.println(solve(world));
        }

    }

    static int solve(int[][] input) {
        int res = 0;
        for (int i = 0; i < W; i++) {
            for (int j = 0; j < H; j++) {
                if (world[j][i] == 1){
                    dfs(i, j);
                    res++;
                }
            }
        }
        return res;
    }

    static void dfs(int x, int y) {
        count++;
        world[y][x] = 0;
        for (int dx = -1; dx <= 1; dx++) {
            for(int dy=-1; dy<=1;dy++){
            int nx = x + dx;
            int ny = y + dy;
                if (nx >= 0 && nx < W && ny >= 0 && ny < H && world[ny][nx] == 1) {
                    dfs(nx, ny);
                }
            }

        }

    }
}