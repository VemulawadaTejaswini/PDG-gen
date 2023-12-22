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
            int N = in.nextInt();
            int count = 0;
            int PjMin = Integer.MAX_VALUE;

            for (int i = 0; i < N; i++) {
                int Pi = in.nextInt();
                if (Pi <= PjMin) {
                    count++;
                }
                if (PjMin >= Pi) {
                    PjMin = Pi;
                }
            }
            out.println(count);
        }
    }
}