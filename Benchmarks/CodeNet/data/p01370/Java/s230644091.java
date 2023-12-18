import java.awt.Point;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int t = sc.nextInt();
            int n = sc.nextInt();
            if ((t | n) == 0)
                break;
            int[][] map = new int[121][121];
            boolean[][] visited = new boolean[121][121];
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                map[y + 60][x + 60] = -1;
            }
            Queue<Point> q = new LinkedList<Point>();
            int sx = sc.nextInt() + 60;
            int ans = 0;
            int sy = sc.nextInt() + 60;
            q.add(new Point(sx, sy));
            visited[sy][sx] = true;
            while (!q.isEmpty()) {
                Point p = q.poll();
                int x = p.x;
                int y = p.y;
                if (map[y][x] > t)
                    continue;
                ans++;
                int dx[] = { 1, 1, 0, -1, -1, 0 };
                int dy[] = { 0, 1, 1, 0, -1, -1 };
                for (int i = 0; i < 6; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];
                    if (nx >= 0 && ny >= 0 && ny < 121 && nx < 121
                            && map[ny][nx] != -1) {
                        if (visited[ny][nx]) {
                            continue;
                        }
                        visited[ny][nx] = true;
                        map[ny][nx] = map[y][x] + 1;
                        q.add(new Point(nx, ny));
                    }
                }
            }
            System.out.println(ans);
        }
    }
}