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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B
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
            long cnt = 0;
            for (int i = 0; i < N; i++)
            {
                for (int j = i + 1; j < N; j++)
                {
                    for (int z = j + 1; z < N; z++)
                    {
                        if (nums[i] != nums[j] && nums[i] != nums[z] && nums[j] != nums[z])
                        {
                            if (isOK(nums[i], nums[j], nums[z]))
                            {
                                cnt++;
                            }
                        }
                    }
                }
            }
            out.println(cnt);
        }

        private boolean isOK(int a, int b, int c)
        {
            return ((a + b) > c) && ((a + c) > b) && ((b + c) > a);
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

