import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

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
            int H = in.nextInt(), W = in.nextInt();
            int CH = in.nextInt() - 1, CW = in.nextInt() - 1;
            int DH = in.nextInt() - 1, DW = in.nextInt() - 1;
            char[][] GRID = CPUtils.readCharMatrix(H, W, in);
            boolean[][] visited = new boolean[H][W];

            Deque<Cell> Q = new LinkedList<>();
            Q.add(new Cell(CH, CW, 0));

            int ans = -1;
            while (!Q.isEmpty())
            {
                Cell visiting = Q.poll();
                if (visiting.row == DH && visiting.col == DW)
                {
                    ans = visiting.moves;
                    break;
                }
                if (visited[visiting.row][visiting.col]) continue;
                visited[visiting.row][visiting.col] = true;

                int offsets[][] = new int[][]{{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
                boolean blocked = true;
                for (int[] offset : offsets)
                {
                    int nextRow = visiting.row + offset[0], nextCol = visiting.col + offset[1];
                    if (isValid(nextRow, nextCol, H, W) && GRID[nextRow][nextCol] == '.' && !visited[nextRow][nextCol])
                    {
                        Q.add(new Cell(nextRow, nextCol, visiting.moves));
                        blocked = false;
                    }
                }
                if (blocked)
                {
                    for (int rowOffset = -2; rowOffset <= 2; rowOffset++)
                    {
                        for (int colOffset = -2; colOffset <= 2; colOffset++)
                        {
                            int nextRow = visiting.row + rowOffset, nextCol = visiting.col + colOffset;
                            if (isValid(nextRow, nextCol, H, W) && GRID[nextRow][nextCol] == '.' && !visited[nextRow][nextCol])
                            {
                                Q.add(new Cell(nextRow, nextCol, visiting.moves + 1));
                            }
                        }
                    }
                }
            }
            out.println(ans);
        }

        private boolean isValid(int nextRow, int nextCol, int h, int w)
        {
            return nextRow >= 0 && nextRow < h && nextCol >= 0 && nextCol < w;
        }

    }

    static class CPUtils
    {
        public static char[][] readCharMatrix(int rows, int columns, Scanner in)
        {
            char[][] matrix = new char[rows][columns];
            for (int i = 0; i < rows; i++)
            {
                matrix[i] = in.next().toCharArray();
            }
            return matrix;
        }

    }

    static class Cell
    {
        int row;
        int col;
        int moves;

        Cell(int row, int col, int moves)
        {
            this.row = row;
            this.col = col;
            this.moves = moves;
        }

    }
}

