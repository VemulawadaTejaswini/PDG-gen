import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Mehvix
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        abc167_a solver = new abc167_a();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc167_a {
        public void solve(int testNumber, Scanner fin, PrintWriter fout) {
            String s = fin.next();
            String t = fin.next();


            if (t.substring(0, t.length() - 1).equals(s)) {
                fout.println("Yes");
            } else {
                fout.println("No");
            }
        }

    }
}

