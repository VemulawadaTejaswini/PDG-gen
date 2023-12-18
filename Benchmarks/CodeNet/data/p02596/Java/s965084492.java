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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC
    {
        public void solve(int testNumber, Scanner in, PrintWriter out)
        {
            int N = in.nextInt();
            if (N % 2 == 0)
            {
                out.print(-1);
                return;
            }
            long k = 7;
            long cnt = 1;
            while (true)
            {
                if (k % N == 0)
                {
                    out.print(cnt);
                    break;
                }
                if (cnt > N)
                {
                    out.print(-1);
                    break;
                }
                k = (k % N) * 10 + 7;
                ++cnt;
            }
        }

    }
}

