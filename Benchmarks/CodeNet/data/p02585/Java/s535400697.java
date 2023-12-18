import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;

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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D
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
            int K = in.nextInt() + 1;
            int P[] = CPUtils.readIntArray(N, in);
            int nums[] = CPUtils.readIntArray(N, in);

            long ans = Integer.MIN_VALUE;
            for (int idx = 1; idx <= N; idx++)
            {
                Map<Integer, Long> map = new HashMap<>();
                boolean visited[] = new boolean[N];
                fill(idx, 1, map, visited, P, 0, nums);
                long maxSum = Integer.MIN_VALUE;
                for (int move : map.keySet())
                {
                    maxSum = Math.max(maxSum, map.get(move));
                }

                if (K <= map.keySet().size() || map.get(map.keySet().size()) <= 0)
                {
                    ans = Math.max(ans, maxSum);
                    ;
                } else
                {
                    long times = (K / map.keySet().size()) - 1;
                    long l_ans = times * map.get(map.keySet().size());

                    boolean all = K % map.keySet().size() == 0;
                    long l_sum = Integer.MIN_VALUE;
                    for (int move = 1; move < (K % map.keySet().size()) || (all && move <= map.keySet().size()); move++)
                    {
                        l_sum = Math.max(l_sum, map.get(move));
                    }
                    l_ans += l_sum;
                    ans = Math.max(ans, l_ans);
                }
            }
            out.print(ans);
        }

        private void fill(int idx, int n, Map<Integer, Long> map, boolean[] visited, int[] p, long sum, int nums[])
        {
            if (visited[idx - 1]) return;
            visited[idx - 1] = true;

            sum += nums[idx - 1];
            map.put(n, sum);
            fill(p[idx - 1], n + 1, map, visited, p, sum, nums);
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

