import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;

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
            int n = Integer.parseInt(in.next());
            String s[] = new String[n];
            for (int i = 0; i < n; i++) {
                s[i] = in.next();
            }
            Arrays.sort(s);
            Map<String, Integer> m = new HashMap<>();
            int cnt = 0;

            for (int i = 0; i < n; i++) {
                if (m.get(s[i]) == null) {
                    m.put(s[i], 0);
                } else {
                    cnt = m.get(s[i]) + 1;
                    m.put(s[i], cnt);
                }
            }

            List<String> t = new ArrayList<>();
            int tmp = 0;
            for (int i = 0; i < n; i++) {
                tmp = Math.max(tmp, m.get(s[i]));
            }

            for (Map.Entry<String, Integer> e : m.entrySet()) {
                if (tmp == e.getValue()) {
                    t.add(e.getKey());
                }
            }
            Collections.sort(t);
            for (int i = 0; i < t.size(); i++) {
                out.println(t.get(i));
            }
        }

    }
}

