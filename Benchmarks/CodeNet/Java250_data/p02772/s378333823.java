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
        TaskAtCoder solver = new TaskAtCoder();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskAtCoder
    {
        public void solve(int testNumber, Scanner in, PrintWriter out)
        {
            int N = in.nextInt();
            int A[] = CPUtils.readIntArray(N, in);
            for (int el : A)
            {
                if (el % 2 == 0)
                {
                    if (el % 3 != 0 && el % 5 != 0)
                    {
                        out.print("DENIED");
                        return;
                    }
                }
            }
            out.print("APPROVED");
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

