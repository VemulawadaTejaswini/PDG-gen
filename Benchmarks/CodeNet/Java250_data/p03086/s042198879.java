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
 *
 * @author ky112233
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BATCoder solver = new BATCoder();
        solver.solve(1, in, out);
        out.close();
    }

    static class BATCoder {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String str = in.next();
            Set<Character> set = new HashSet<>();
            set.add('A');
            set.add('C');
            set.add('G');
            set.add('T');
            int j = 0;
            int mx = 0;
            for (int i = 0; i < str.length(); i++) {
                if (set.contains(str.charAt(i))) {
                    mx = Math.max(mx, i - j + 1);
                } else {
                    j = i + 1;
                }
            }
            out.println(mx);
        }

    }
}

