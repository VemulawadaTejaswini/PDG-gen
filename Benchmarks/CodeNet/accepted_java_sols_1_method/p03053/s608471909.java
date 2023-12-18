import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] a = new char[h][w];
        Deque<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < h; i++) {
            a[i] = sc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                if (a[i][j] == '#') {
                    queue.add(new int[] { i, j });
                }
            }
        }
        int cnt = -1;
        final int[][] DXDY = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
        while (!queue.isEmpty()) {
            int size = queue.size();
            cnt++;
            for (int i = 0; i < size; i++) {
                int[] p = queue.poll();
                for (int j = 0; j < DXDY.length; j++) {
                    int x = p[0] + DXDY[j][0];
                    int y = p[1] + DXDY[j][1];
                    if (x < 0 || x >= h || y < 0 || y >= w || a[x][y] == '#') {
                        continue;
                    }
                    a[x][y] = '#';
                    queue.add(new int[] { x, y });
                }
            }
        }
        System.out.println(cnt);
    }
}
