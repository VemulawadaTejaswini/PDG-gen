import java.awt.Point;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        String[][] s = new String[h][w];
        for (int i = 0; i < h; i++) {
            s[i] = sc.next().split("");
        }

        Deque<Point> queue = new ArrayDeque<>();
        queue.add(new Point(0, 0));
        int depth = 1;
        boolean[][] visited = new boolean[h][w];
        visited[0][0] = true;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (".".equals(s[i][j])) {
                    visited[i][j] = true;
                }
            }
        }
        while (!queue.isEmpty()) {
            int size = queue.size();
            if (size >= 2) {
                System.out.println("Impossible");
                return;
            }
            for (int i = 0; i < size; i++) {
                final int[][] DXDY = { { 1, 0 }, { 0, 1 } };
                Point p = queue.poll();
                int posx = p.x;
                int posy = p.y;
                for (int j = 0; j < DXDY.length; j++) {
                    int x = posx + DXDY[j][0];
                    int y = posy + DXDY[j][1];
                    if (x < 0 || x >= s.length || y < 0 || y >= s[0].length || ".".equals(s[x][y])
                        || visited[x][y]) {
                        continue;
                    }
                    visited[x][y] = true;
                    queue.add(new Point(x, y));
                }
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (!visited[i][j]) {
                    System.out.println("Impossible");
                    return;
                }
            }
        }
        System.out.println("Possible");
    }
}
