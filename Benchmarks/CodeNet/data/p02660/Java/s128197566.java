import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author CompuWare
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DDivGame solver = new DDivGame();
        solver.solve(1, in, out);
        out.close();
    }

    static class DDivGame {
        ArrayList<Integer> arr = new ArrayList<>();

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long x = in.nextLong();
            long r = x;
            int n = 2;
            while (x > 1) {
                if (n > x)
                    break;
                if (x % n == 0) {
                    x /= n;
                    arr.add(n);
                } else {
                    n++;
                }
            }
            int j = 0;
            int count = 0;
            for (int i = 1; i < arr.size(); i++) {
                if (arr.get(j) != arr.get(i)) {
                    count += sol(i - j);
                    j = i;
                }
            }
            out.print(count);
        }

        private int sol(int i) {
            int sum = 0;
            int c = 0;
            for (int j = 1; ; j++) {
                if (sum + j > i) {
                    break;
                }
                sum += j;
                c++;
            }
            return c;
        }

    }
}

