import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] c = new char[h][w];
        char[][] g = new char[h][w];
        for (int i = 0; i < h; i++) {
            String s = sc.next();
            c[i] = s.toCharArray();
            for (int j = 0; j < w; j++) {
                g[i][j] = '.';
            }
        }

        int[] dy = {-1, 0, 0, 1};
        int[] dx = {0, -1, 1, 1};
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                if (c[y][x] == '.' && g[y][x] == '.') {
                    continue;
                }
                if (c[y][x] == '#') {
                    if (g[y][x] == '.') {
                        g[y][x] = '#';
                    } else {
                        continue;
                    }
                    boolean f = false;
                    for (int i = 0; i < 4; i++) {
                        if (y + dy[i] < 0 || x + dx[i] < 0 || y + dy[i] >= h || x + dx[i] >= w) {
                            continue;
                        }
                        if (c[y + dy[i]][x + dx[i]] == '.') {
                            continue;
                        }
                        if (c[y + dy[i]][x + dx[i]] == '#') {
                            g[y + dy[i]][x + dx[i]] = '#';
                            f = true;
                            break;
                        }
                    }
                    if (!f) {
                        break;
                    }
                }
            }
        }
        for (int y = 0; y < h; y++) {
            //System.out.println(">>>"+(new String(g[y])));
            for (int x = 0; x < w; x++) {
                if (c[y][x] != g[y][x]) {
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}