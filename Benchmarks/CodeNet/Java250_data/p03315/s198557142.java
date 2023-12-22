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
        ABC101_A solver = new ABC101_A();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC101_A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            char[] array = in.nextLine().toCharArray();

            int ans = 0;
            for (char c : array) {
                if (c == '+') {
                    ans++;
                } else {
                    ans--;
                }
            }
            out.print(ans);
        }

    }
}

