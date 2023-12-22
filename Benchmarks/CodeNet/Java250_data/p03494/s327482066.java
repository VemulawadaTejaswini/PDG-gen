import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        BShiftOnly solver = new BShiftOnly();
        solver.solve(1, in, out);
        out.close();
    }

    static class BShiftOnly {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = Integer.parseInt(in.next());
            int bit = 0;
            for (int i = 0; i < n; i++) {
                bit = bit | in.nextInt();
            }
            out.println(Integer.numberOfTrailingZeros(bit));
        }

    }
}

