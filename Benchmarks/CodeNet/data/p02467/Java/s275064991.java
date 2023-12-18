import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        PrimeFactorize solver = new PrimeFactorize();
        solver.solve(1, in, out);
        out.close();
    }

    static class PrimeFactorize {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            ArrayList<Integer> primes = Prime.eratosthenes(100000);

            int n = in.nextInt();
            out.print(n + ": ");
            for (int p : primes) {
                while (n % p == 0) {
                    out.print(p);
                    n /= p;
                    if (n != 1) out.print(" ");
                }
            }
            if (n != 1) out.print(n);
            out.println();

        }

    }

    static class Prime {
        public static ArrayList<Integer> eratosthenes(int n) {
            // n以下の素数をすべて列挙する(計算量は O(N log(log N)))
            // ただし10^5が耐用限界っぽい感じはする

            ArrayList<Integer> res = new ArrayList<>();
            ArrayList<Integer> primes = new ArrayList<>();
            for (int i = 2; i <= n; i++) {
                res.add(i);
            }
            while (res.size() > 0) {
                primes.add(res.get(0));
                res.removeIf(a -> a % res.get(0) == 0);
            }
            return primes;
        }

    }
}


