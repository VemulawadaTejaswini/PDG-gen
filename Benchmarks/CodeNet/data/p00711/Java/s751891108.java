import java.util.Scanner;

/**
 * Created by Reopard on 2014/05/29.
 */
public class RedandBlack {

    static Scanner sc = new Scanner(System.in);
    static char[][] tile = new char[22][22];
    static char black_tile = '.', red_tile = '#', player_tile = '@';
    static int W = 0, H = 0;

    public static void main(String args[]) {
        int x = 0, y = 0;
        while ((W = sc.nextInt()) != 0 && (H = sc.nextInt()) != 0) {
            for (int i = 0; i <= W + 1; i++) tile[0][i] = red_tile;
            for (int i = 1; i <= H; i++) tile[i] = (red_tile + sc.next() + red_tile).toCharArray();
            for (int i = 0; i <= W + 1; i++) tile[H + 1][i] = red_tile;
            outer:
            for (int i = 1; i <= H; i++) {
                for (int j = 1; j <= W; j++) {
                    if (tile[i][j] == player_tile) {
                        x = j;
                        y = i;
                        break outer;
                    }
                }
            }
            System.out.println(countBlackTile(x, y)/4);
        }
    }

    static int countBlackTile(int x, int y) {
        int[] dx = {0, 1, 0, -1};
        int[] dy = {-1, 0, 1, 0};
        int count = 0;
        if (tile[y][x] == red_tile) return 0;
        else {
            tile[y][x] = red_tile;
            for(int i = 0; i < 4; i++) {
                count += countBlackTile(x + dx[i], y + dy[i]) + 1;
            }
        }
        return count;
    }
}