import java.io.File;
import java.util.Scanner;

/**
 * Created by YuyaKita on 2015/05/18.
 */
public class Main {
    static final int MAX_W = 20, MAX_H = 20;
    static int W, H;
    static char[][] tiles = new char[MAX_H + 1][MAX_W + 1];
    static int count = 0;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        while (true) {
            W = sc.nextInt();
            H = sc.nextInt();
            if (W == 0 && H == 0){
                break;
            }
            sc.nextLine();
            for (int i = 0; i < H; i++) {
                tiles[i] = sc.nextLine().toCharArray();
            }

            System.out.println(solve(tiles));
        }
            sc.close();

    }

    static int solve(char[][] input) {
        count = 0;
        for (int i = 0; i < W; i++) {
            for (int j = 0; j < H; j++) {
                if (tiles[j][i] == '@') dfs(i, j);
            }
        }
        return count;
    }

    static void dfs(int x, int y) {
        count++;
        tiles[y][x] = '#';
        for (int i = 0; i < dx.length; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < W && ny >= 0 && ny < H && tiles[ny][nx] == '.') {

                dfs(nx, ny);
            }
        }


    }

}