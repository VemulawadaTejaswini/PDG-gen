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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 整数の入力
            int X = Integer.parseInt(in.next());
            int ans = X;
            boolean rt = true;

            while (rt) {
                rt = isPrime(ans);
                ans++;
            }
            // 出力
            out.println(ans - 1);

        }

        public static boolean isPrime(int num) {
            if (num < 2) return true;
            else if (num == 2) return false;
            else if (num % 2 == 0) return true; // 偶数はあらかじめ除く

            double sqrtNum = Math.sqrt(num);
            for (int i = 3; i <= sqrtNum; i += 2) {
                if (num % i == 0) {
                    // 素数ではない
                    return true;
                }
            }

            // 素数である
            return false;
        }

    }
}

