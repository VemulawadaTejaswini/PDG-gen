import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BBreakNumber solver = new BBreakNumber();
        solver.solve(1, in, out);
        out.close();
    }

    static class BBreakNumber {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            out.println((int) Math.pow(2, Math.floor(Math.log(in.nextInt()) / Math.log(2))));
        }

    }
}

