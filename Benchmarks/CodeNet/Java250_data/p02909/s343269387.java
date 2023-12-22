import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        abc141_a solver = new abc141_a();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc141_a {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String S = in.next();

            if (S.compareTo("Sunny") == 0) {
                out.println("Cloudy");
                return;
            }
            if (S.compareTo("Cloudy") == 0) {
                out.println("Rainy");
                return;
            }
            if (S.compareTo("Rainy") == 0) {
                out.println("Sunny");
                return;
            }


        }

    }
}

