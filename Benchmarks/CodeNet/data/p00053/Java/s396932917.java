import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Main {

    public static void main(String[] args) throws IOException {
        doit(args, System.in, System.out);
    }

    static void doit(String[] args, InputStream in, PrintStream out)
            throws IOException {
        boolean[] sieve = new boolean[104729 + 1];
        for (int p = 2; p < Math.sqrt(sieve.length); p++) {
            if (sieve[p]) {
                continue;
            }
            for (int q = p * 2; q < sieve.length; q += p) {
                sieve[q] = true;
            }
        }
        int[] sums = new int[10001];
        int k = 0;
        for (int p = 2; p < sieve.length; p++) {
            if (sieve[p]) {
                continue;
            }
            k++;
            sums[k] = sums[k - 1] + p;
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        while (true) {
            int n = Integer.parseInt(reader.readLine());
            if (n == 0) {
                break;
            }
            out.println(sums[n]);
        }
    }
}