import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.Map;
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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int x = Integer.parseInt(in.next());
            int n = Integer.parseInt(in.next());

            if (n == 0) {
                out.println(x);
                return;
            }
            int[] p = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = Integer.parseInt(in.next());
            }
            Arrays.sort(p);
            int ans = Integer.MAX_VALUE;
            boolean ng = false;
            Map<Integer, Integer> mp = new TreeMap<>();
            for (int i = 101; i >= 0; i--) {
                for (int j = 0; j < n; j++) {
                    if (i == p[j]) {
                        ng = true;
                        break;
                    }
                }
                if (!ng) {
                    int tmp = Math.abs(x - i);
                    mp.put(tmp, i);
                }
                ng = false;

            }

            // 出力
            for (Integer val : mp.values()) {
                out.println(val.toString());
                return;
            }
        }

    }
}

