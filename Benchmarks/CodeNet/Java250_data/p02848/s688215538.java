import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            StringBuilder sb = new StringBuilder();
            int n = in.nextInt();
            String s = in.next();
            String res;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                c = (char) ((c - 'A' + n) % 26 + 'A');
                sb.append(c);
            }
            res = new String(sb);
            out.println(res);
        }

    }
}

