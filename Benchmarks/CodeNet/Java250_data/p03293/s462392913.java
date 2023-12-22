import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author hakamada
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AtCoder109_2 solver = new AtCoder109_2();
        solver.solve(1, in, out);
        out.close();
    }

    static class AtCoder109_2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String phrase = in.nextLine();
            String matcher = in.nextLine();
            if (phrase.compareTo(matcher) == 0) {
                out.println("Yes");
                return;
            }


            for (int i = 1; i < phrase.length(); i++) {
                String work1 = matcher.substring((matcher.length() - i));
                String work2 = matcher.substring(0, (matcher.length() - i));
                String work3 = work1 + work2;
                if (work3.compareTo(phrase) == 0) {
                    out.println("Yes");
                    return;

                }
            }

            out.println("No");
        }

    }
}

