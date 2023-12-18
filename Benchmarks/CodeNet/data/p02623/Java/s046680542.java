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
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task
    {
        public void solve(int testNumber, Scanner in, PrintWriter out)
        {
            int N = in.nextInt();
            int M = in.nextInt();
            int K = in.nextInt();
            int A[] = CPUtils.readIntArray(N, in);
            int B[] = CPUtils.readIntArray(M, in);
            long[] prefix_sum_A = getPrefixSum(A);
            long[] prefix_sum_B = getPrefixSum(B);

            long max = 0;
            max = getMax(K, A, prefix_sum_A, prefix_sum_B, max);
            max = getMax(K, B, prefix_sum_B, prefix_sum_A, max);

            max = getMax(M, K, prefix_sum_B, max);
            max = getMax(N, K, prefix_sum_A, max);

            out.println(max);
        }

        private long getMax(int m, int k, long[] prefix_sum_B, long max)
        {
            if (k >= prefix_sum_B[m - 1])
            {
                max = Math.max(max, m);
            }
            return max;
        }

        private long getMax(int k, int[] a, long[] prefix_sum_A, long[] prefix_sum_B, long max)
        {
            for (int i = 0; i < a.length; i++)
            {
                if (prefix_sum_A[i] <= k)
                {
                    int books = i + 1;
                    int low = lowerBound(prefix_sum_B, k - prefix_sum_A[i] + 1);
                    if (low - 1 >= 0)
                        books += low;
                    max = Math.max(max, books);
                }
            }
            return max;
        }

        private long[] getPrefixSum(int A[])
        {
            long[] prefix_sum = new long[A.length];
            prefix_sum[0] = A[0];
            for (int i = 1; i < A.length; i++)
            {
                prefix_sum[i] = prefix_sum[i - 1] + A[i];
            }
            return prefix_sum;
        }

        public static int lowerBound(long[] array, long value)
        {
            int low = 0;
            int high = array.length;
            while (low < high)
            {
                int mid = (low + high) / 2;
                if (value <= array[mid])
                {
                    high = mid;
                } else
                {
                    low = mid + 1;
                }
            }
            return low;
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

    }
}

