import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BDigitSums solver = new BDigitSums();
        solver.solve(1, in, out);
        out.close();
    }

    static class BDigitSums {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int max = (int) Math.sqrt(N) + 1;
            int sn = 0;
            String s = "" + N;
            for (int i = 0; i < s.length(); i++) {
                sn += Integer.parseInt("" + s.charAt(i));
            }
            out.println(N % sn == 0 ? "Yes" : "No");
        }

    }
}

