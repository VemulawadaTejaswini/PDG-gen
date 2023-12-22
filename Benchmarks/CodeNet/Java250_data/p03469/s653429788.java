import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AAlready2018 solver = new AAlready2018();
        solver.solve(1, in, out);
        out.close();
    }

    static class AAlready2018 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            out.println("2018" + in.next().substring(4));
        }

    }
}

