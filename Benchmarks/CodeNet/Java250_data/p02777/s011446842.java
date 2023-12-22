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
            String S = in.next();
            String T = in.next();
            int A = in.nextInt();
            int B = in.nextInt();
            String U = in.next();
            
            if (S.equals(U)) {
                A--;
            }
            else {
                B--;
            }
            out.println(A + " " + B);
        }
    }
}