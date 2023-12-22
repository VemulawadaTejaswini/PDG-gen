import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Solver solver = new Solver();
        solver.solve(in, out);
        out.close();
    }

    static class Solver {
        public void solve(Scanner in, PrintWriter out) {
            long H = in.nextLong();
            long count = 0;
            long loop = 0;

            do {
                count += Math.pow(2, loop);
                loop++;
                H /= 2;
            }
            while (H >= 1);

            out.println(count);
        }
    }
}