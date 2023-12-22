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
        ABC085B solver = new ABC085B();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC085B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 整数の入力
            int n = Integer.parseInt(in.next());
            Integer[] d = new Integer[n];
            for (int i = 0; i < n; i++) {
                d[i] = Integer.parseInt(in.next());
            }
            Set<Integer> ans = new HashSet();
            for (int i = 0; i < n; i++) {
                ans.add(d[i]);
            }


            // 出力
            out.println(ans.size());

        }

    }
}

