import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayDeque;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main
{
    public static void main(String[] args)
    {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD
    {
        static int h;
        static int w;
        static char[][] board;

        public void solve(int testNumber, Scanner in, PrintWriter out)
        {
            int T = 1;
            while (T-- > 0)
            {
                solveOne(in, out);
            }
        }

        private void solveOne(Scanner in, PrintWriter out)
        {
            h = in.nextInt();
            w = in.nextInt();
            int sy = in.nextInt() - 1, sx = in.nextInt() - 1;
            int ey = in.nextInt() - 1, ex = in.nextInt() - 1;
            ArrayDeque<Integer> xs = new ArrayDeque<>(), ys = new ArrayDeque<>();
            board = new char[w][h];
            for (int y = 0; y < h; y++)
            {
                char[] line = in.next().toCharArray();
                for (int x = 0; x < w; x++)
                {
                    board[x][y] = line[x];
                }
            }
            xs.add(sx);
            ys.add(sy);
            int[][] dist = new int[w][h];
            for (int x = 0; x < w; x++) Arrays.fill(dist[x], 1_000_000_000);
            dist[sx][sy] = 0;
            int[] dx = {-1, 1, 0, 0};
            int[] dy = {0, 0, -1, 1};
            while (!xs.isEmpty())
            {
                int curX = xs.removeFirst(), curY = ys.removeFirst();
                for (int d = 0; d < 4; d++)
                {
                    int nx = curX + dx[d], ny = curY + dy[d];
                    if (!legal(nx, ny)) continue;
                    if (dist[nx][ny] > dist[curX][curY])
                    {
                        dist[nx][ny] = dist[curX][curY];
                        xs.addFirst(nx);
                        ys.addFirst(ny);
                    }
                }
                for (int x = curX - 2; x <= curX + 2; x++)
                {
                    for (int y = curY - 2; y <= curY + 2; y++)
                    {
                        if (!legal(x, y)) continue;
                        if (dist[x][y] > dist[curX][curY] + 1)
                        {
                            dist[x][y] = dist[curX][curY] + 1;
                            xs.addLast(x);
                            ys.addLast(y);
                        }
                    }
                }
            }
            out.println(dist[ex][ey] > 1e7 ? -1 : dist[ex][ey]);
        }

        static boolean legal(int x, int y)
        {
            if (x < 0 || y < 0 || x >= w || y >= h || board[x][y] == '#') return false;
            return true;
        }

    }
}

