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
        aoj solver = new aoj();
        solver.solve(1, in, out);
        out.close();
    }

    static class aoj {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long[] len = new long[3];
            while (true) {
                len[0] = in.nextLong();
                len[1] = in.nextLong();
                len[2] = in.nextLong();
                if (len[0] == 0 && len[1] == 0 && len[2] == 0) break;

                Arrays.sort(len);
                double min1 = len[0], min2 = len[1];


                int loops = in.nextInt();
                for (int i = 0; i < loops; i++) {
                    long r = in.nextLong() * 2;

                    // x^2 + y^2 < r^2
                    if (min1 * min1 + min2 * min2 < r * r) {
                        out.println("OK");
                    } else {
                        out.println("NA");
                    }
                }
            }
        }

    }
}


