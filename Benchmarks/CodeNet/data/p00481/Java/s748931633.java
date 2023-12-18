import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt(), W = sc.nextInt(), N = sc.nextInt();
        sc.nextLine();
        int sx = -1, sy = -1;
        char[][] map = new char[H][W];
        int[][] fac = new int[N][2];
        for (int i = 0; i < H; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < W; j++) {
                map[i][j] = line.charAt(j);
                if (map[i][j] == 'S') {
                    sx = i;
                    sy = j;
                } else if (Character.isDigit(map[i][j])) {
                    int t = map[i][j] - '0';
                    fac[t - 1][0] = i;
                    fac[t - 1][1] = j;
                }
            }
        }
        dis = new int[H][W];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < H; j++) {
                for (int k = 0; k < W; k++) {
                    dis[j][k] = Integer.MAX_VALUE;
                }
            }
            sum += bfs(map, sx, sy, fac[i][0], fac[i][1]);
            sx = fac[i][0];
            sy = fac[i][1];
        }
        System.out.println(sum);

    }

    public static int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public static int[][] dis;

    public static int bfs(char[][] map, int sx, int sy, int ex, int ey) {
        if (sx == ex && sy == ey) return 0;
        Queue<P> queue = new LinkedList<>();
        queue.add(new P(sx, sy));
        dis[sx][sy] = 0;

        while (!queue.isEmpty()) {
            P p = queue.poll();
            if (p.x == ex && p.y == ey) break;
            for (int i = 0; i < 4; i++) {
                int newx = p.x + dir[i][0];
                int newy = p.y + dir[i][1];
                if (newx < 0 || newy < 0 || newx >= map.length || newy >= map[0].length || dis[newx][newy] != Integer.MAX_VALUE || map[newx][newy] == 'X')
                    continue;
                dis[newx][newy] = dis[p.x][p.y] + 1;
                queue.add(new P(newx, newy));
            }
        }
        return dis[ex][ey];

    }

}

class P {
    public P(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int x, y;

}

