import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

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
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE
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
            int N = in.nextInt();
            int points[][] = CPUtils.readIntMatrix(N, 2, in);

            int[] x = new int[points.length];
            int[] y = new int[points.length];

            long ans = 0;
            for (int idx = 0; idx < points.length; idx++)
            {
                x[idx] = points[idx][0];
                y[idx] = points[idx][1];
            }

            long max_xi_plus_yi = Integer.MIN_VALUE;
            long min_xi_plus_yi = Integer.MAX_VALUE;
            long max_xi_minus_yi = Integer.MIN_VALUE;
            long min_xi_minus_yi = Integer.MAX_VALUE;

            for (int idx = 0; idx < points.length; idx++)
            {
                max_xi_plus_yi = Math.max(max_xi_plus_yi, x[idx] + y[idx]);
                min_xi_plus_yi = Math.min(min_xi_plus_yi, x[idx] + y[idx]);
                max_xi_minus_yi = Math.max(max_xi_minus_yi, x[idx] - y[idx]);
                min_xi_minus_yi = Math.min(min_xi_minus_yi, x[idx] - y[idx]);
            }
            out.println(Math.max(max_xi_plus_yi - min_xi_plus_yi, max_xi_minus_yi - min_xi_minus_yi));
        }

    }

    static class CPUtils
    {
        public static int[] readIntArray(int size, Scanner in)
        {
            int[] array = new int[size];
            for (int i = 0; i < size; i++)
            {
                array[i] = in.nextInt();
            }
            return array;
        }

        public static int[][] readIntMatrix(int rows, int columns, Scanner in)
        {
            int[][] matrix = new int[rows][columns];
            for (int i = 0; i < rows; i++)
            {
                matrix[i] = CPUtils.readIntArray(columns, in);
            }
            return matrix;
        }

    }
}

