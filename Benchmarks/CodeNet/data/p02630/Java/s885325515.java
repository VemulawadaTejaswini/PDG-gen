import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
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
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task
    {
        public void solve(int testNumber, Scanner in, PrintWriter out)
        {
            int N = in.nextInt();
            Map<Integer, Long> map = new HashMap<>();
            long sum = 0;
            for (int i = 0; i < N; i++)
            {
                int el = in.nextInt();
                map.put(el, map.getOrDefault(el, 0L) + 1);
                sum += el;
            }
            int Q = in.nextInt();

            while (Q-- > 0)
            {
                int B = in.nextInt();
                int C = in.nextInt();

                if (map.containsKey(B))
                {
                    long occ = map.get(B);
                    long term = B * occ;
                    sum -= term;
                    map.put(C, map.getOrDefault(C, 0L) + occ);
                    map.remove(B);
                    sum += occ * C;
                }
                out.println(sum);
            }
        }

    }
}

