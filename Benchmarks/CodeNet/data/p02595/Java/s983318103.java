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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB
    {
        public void solve(int testNumber, Scanner in, PrintWriter out)
        {
            int N = in.nextInt();
            double D = in.nextInt();

            int cnt = 0;
            while (N > 0)
            {
                double X = in.nextInt();
                double Y = in.nextInt();
                if (Math.sqrt(X * X + Y * Y) <= D)
                {
                    cnt++;
                }
                N--;
            }
            out.print(cnt);
        }

    }
}

