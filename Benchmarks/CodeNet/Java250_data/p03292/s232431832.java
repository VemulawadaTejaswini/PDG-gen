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
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC103_A solver = new ABC103_A();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC103_A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int[] a = new int[3];
            a[0] = in.nextInt();
            a[1] = in.nextInt();
            a[2] = in.nextInt();

            Arrays.sort(a);

            out.print(a[2] - a[0]);

        }

    }
}

