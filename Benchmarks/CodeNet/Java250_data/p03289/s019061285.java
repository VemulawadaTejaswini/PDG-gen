import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author ks96neko
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BAcCepted solver = new BAcCepted();
        solver.solve(1, in, out);
        out.close();
    }

    static class BAcCepted {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String r = in.next();
            int rl = r.length();

            String r0 = r.substring(0, 1);
            String a = "A";

            String shortenedString = r.substring(2, rl - 1);
            int c1mojime = shortenedString.indexOf("C");
            int cNmojime = shortenedString.lastIndexOf("C");

            if (!a.equals(r0)) {
                out.println("WA");
                return;
            }
            if (c1mojime == -1) {
                out.println("WA");
                return;
            }
            if (c1mojime != cNmojime) {
                out.println("WA");
                return;
            }
            for (int i = 1; i < rl; i++) {
                if (r.charAt(i) != 'C' && Character.isUpperCase(r.charAt(i))) {
                    out.println("WA");
                    return;
                }
            }
            out.println("AC");
        }

    }
}

