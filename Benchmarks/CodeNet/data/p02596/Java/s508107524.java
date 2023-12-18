import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int K = Integer.parseInt(in.next());
            int x = 7 % K;
            int i = 1;
            Set<Integer> s = new HashSet<>();
            while (!s.contains(x)) {
                if (x == 0) {
                    out.println(i);
                    return;
                } else {
                    s.add(x);
                    x = (x * 10 + 7) % K;
                    ++i;
                }
            }
            out.println(-1);
        }

    }
}

