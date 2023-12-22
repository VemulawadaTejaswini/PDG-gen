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
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = Integer.parseInt(in.next());
            int A = Integer.parseInt(in.next());
            int B = Integer.parseInt(in.next());

            int sum = 0;
            for (int i = 1; i <= N; i++) {
                int n = i;
                int digSum = 0;
                while (n > 0) {
                    digSum += n % 10;
                    n /= 10;
                }
                if (digSum >= A && digSum <= B)
                    sum += i;
            }
            out.println(sum);
        }

    }
}

