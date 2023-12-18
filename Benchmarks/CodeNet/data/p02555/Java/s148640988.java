import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD
    {
        static int MOD = 1_000_000_000 + 7;
        int memo;

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
            memo = new int[N + 10];
            Arrays.fill(memo, -1);
            out.println(dp(N));
        }

        private int dp(int n)
        {
            if (n == 0) return 1;
            if (n < 0) return 0;
            if (memo[n] != -1) return memo[n];

            int ans = 0;
            for (int num = 3; num <= n; num++)
            {
                ans = (ans + dp(n - num)) % MOD;
            }
            memo[n] = ans;
            return ans;
        }

    }
}

