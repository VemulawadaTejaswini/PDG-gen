import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CBraveForceStory solver = new CBraveForceStory();
        solver.solve(1, in, out);
        out.close();
    }

    static class CBraveForceStory {
        private static int[] DX = {1, 1, 0, -1, -1, 0};
        private static int[] DY = {0, 1, 1, 0, -1, -1};

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int t = in.nextInt(), n = in.nextInt();
            while (t != 0 || n != 0) {
                boolean[][] board = new boolean[200][200], visited = new boolean[200][200];
                for (int i = 0; i < n; i++) {
                    board[in.nextInt() + 100][in.nextInt() + 100] = true;
                }

                Queue<CBraveForceStory.Point> q = new ArrayDeque<>();
                CBraveForceStory.Point start = new CBraveForceStory.Point(in.nextInt() + 100, in.nextInt() + 100, 0);
                q.offer(start);
                visited[start.x][start.y] = true;

                while (!q.isEmpty()) {
                    CBraveForceStory.Point p = q.poll();
                    if (p.d < t) {
                        for (int i = 0; i < 6; i++) {
                            int nx = p.x + DX[i], ny = p.y + DY[i];
                            if (board[nx][ny] || visited[nx][ny]) continue;
                            visited[nx][ny] = true;
                            q.offer(new CBraveForceStory.Point(nx, ny, p.d + 1));
                        }
                    }
                }

                int ans = 0;
                for (int i = 0; i < 200; i++) {
                    for (int j = 0; j < 200; j++) {
                        if (visited[i][j]) ans++;
                    }
                }

                out.println(ans);
                t = in.nextInt();
                n = in.nextInt();
            }
        }

        private static class Point {
            int x;
            int y;
            int d;

            Point(int x, int y, int d) {
                this.x = x;
                this.y = y;
                this.d = d;
            }

        }

    }
}


