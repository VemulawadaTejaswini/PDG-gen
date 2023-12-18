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
        ATherefore solver = new ATherefore();
        solver.solve(1, in, out);
        out.close();
    }

    static class ATherefore {
        public void solve(int testNumber, Scanner fin, PrintWriter fout) {
            int ones = fin.nextInt() % 10;
            if (ones == 3) fout.println("bon");
            else if (ones == 0 || ones == 1 || ones == 6 || ones == 8) fout.println("pon");
            else fout.println("hon");
        }

    }
}

