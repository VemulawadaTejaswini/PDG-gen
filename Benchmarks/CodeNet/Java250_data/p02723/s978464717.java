import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Akash
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ACoffee solver = new ACoffee();
        solver.solve(1, in, out);
        out.close();
    }

    static class ACoffee {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.nextLine();
            boolean result = s.charAt(3) == s.charAt(2) && s.charAt(5) == s.charAt(4);
            out.println(result ? "Yes" : "No");
        }

    }
}

