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
            int T = 1;
            while (T-- > 0)
            {
                solveOne(in, out);
            }
        }

        private void solveOne(Scanner in, PrintWriter out)
        {
            String S = in.next(), T = in.next();

            long ans = Integer.MAX_VALUE;

            for (int idx = 0; idx + T.length() - 1 < S.length(); idx++)
            {
                int diff = 0;
                for (int idx2 = 0; idx2 < T.length(); idx2++)
                {
                    if (S.charAt(idx + idx2) != T.charAt(idx2)) diff++;
                }
                ans = Math.min(ans, diff);
            }
            out.println(ans);
        }

    }
}

