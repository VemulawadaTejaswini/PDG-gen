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
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA
    {
        public void solve(int testNumber, Scanner in, PrintWriter out)
        {
            long A = in.nextLong();
            long B = in.nextLong();
            long K = in.nextLong();
            long AA = A;
            A = Math.max(0, A - K);

            if (A != 0)
            {
                out.print(A + " " + B);
                return;
            }

            K -= AA;
            B = Math.max(0, B - K);
            out.print(A + " " + B);

        }

    }
}

