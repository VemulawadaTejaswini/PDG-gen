import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.math.BigInteger;

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
            int T = 1;
            while (T-- > 0)
            {
                solveOne(in, out);
            }
        }

        private void solveOne(Scanner in, PrintWriter out)
        {
            int N = in.nextInt();
            long[] nums = CPUtils.readLongArray(N, in);
            int MOD = 1_000_000_000 + 7;

            long[] ps = CPUtils.prefixSum(nums);

            BigInteger ans = new BigInteger("" + 0);

            for (int idx = 0; idx < N; idx++)
            {
                ans = ans.add(new BigInteger("" + nums[idx]).multiply(new BigInteger("" + (ps[ps.length - 1] - ps[idx]))));
            }
            out.println(ans.mod(new BigInteger("" + MOD)));
        }

    }

    static class CPUtils
    {
        public static long[] readLongArray(int size, Scanner in)
        {
            long[] array = new long[size];
            for (int i = 0; i < size; i++)
            {
                array[i] = in.nextLong();
            }
            return array;
        }

        public static long[] prefixSum(long nums[])
        {
            long[] prefixSum = new long[nums.length];
            prefixSum[0] = nums[0];
            for (int i = 1; i < prefixSum.length; i++)
            {
                prefixSum[i] += prefixSum[i - 1] + nums[i];
            }
            return prefixSum;
        }

    }
}

