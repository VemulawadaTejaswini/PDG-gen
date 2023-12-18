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
            int nums[] = CPUtils.readIntArray(N, in);

            boolean ok = true;
            for (int i = 1; i < N; i++)
            {
                if (CPUtils.gcd(nums[i], nums[i - 1]) != 1)
                {
                    ok = false;
                    break;
                }
            }
            if (ok)
            {
                out.println("pairwise coprime");
                return;
            }
            ok = true;
            int gcd = nums[0];
            for (int i = 1; i < N; i++)
            {
                gcd = CPUtils.gcd(gcd, nums[i]);
            }
            if (gcd != 1) ok = false;

            if (ok)
            {
                out.println("setwise coprime");
                return;
            }
            out.println("not coprime");
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

        public static int gcd(int n1, int n2)
        {
            if (n2 == 0)
            {
                return n1;
            }
            return gcd(n2, n1 % n2);
        }

    }
}

