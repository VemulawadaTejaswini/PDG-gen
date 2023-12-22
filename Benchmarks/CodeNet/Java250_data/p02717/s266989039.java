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
        abc161_a solver = new abc161_a();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc161_a {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int A = in.nextInt();
            int B = in.nextInt();
            int C = in.nextInt();
            int Wk;

            Wk = A;
            A = B;
            B = Wk;
            Wk = C;
            C = A;
            A = Wk;
            out.print(A);
            out.print(' ');
            out.print(B);
            out.print(' ');
            out.print(C);
            out.println();
        }

    }
}

