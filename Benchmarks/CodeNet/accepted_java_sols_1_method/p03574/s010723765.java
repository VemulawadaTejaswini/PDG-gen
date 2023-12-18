import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 2017/10/20 7:06.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1};
        int[] dy = {-1, -1, -1, 0, 0, 1, 1, 1};

        while (sc.hasNextInt()) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            char[][] t = new char[H][W];
            for (int i = 0; i < H; i++) {
                t[i] = sc.next().toCharArray();
            }
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (t[i][j] == '#') {
                        continue;
                    }
                    t[i][j] = '0';
                    for (int k = 0; k < 8; k++) {
                        int tx = j + dx[k];
                        int ty = i + dy[k];
                        if (0 <= tx && tx < W && 0 <= ty && ty < H && t[ty][tx] == '#') {
                            t[i][j]++;
                        }
                    }
                }
            }
            for (int i = 0; i < H; i++) {
                System.out.println(String.valueOf(t[i]));
            }
        }
    }
}