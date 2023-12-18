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
        static int MOD = 1000000007;

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
            long n = in.nextInt();
            long ans = power(10, n) - power(9, n) - power(9, n) + power(8, n);
            ans %= MOD;
            ans = (ans + MOD) % MOD;

            out.println(ans);
        }

        static long power(long x, long n, int mod)
        {
            if (n == 0)
            {
                return 1;
            }
            long result = power(x, n / 2, mod);
            result = result * result % mod;
            if (n % 2 == 1)
            {
                result = result * x % mod;
            }
            return result;
        }

        static long power(long x, long n)
        {
            return power(x, n, MOD);
        }

    }
}

