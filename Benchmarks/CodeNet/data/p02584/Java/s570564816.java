import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokenizer = new StringTokenizer(f.readLine());
        long x = Long.parseLong(tokenizer.nextToken());
        if (x < 0) x *= -1;
        long k = Long.parseLong(tokenizer.nextToken());
        long orgK = k;
        long d = Long.parseLong(tokenizer.nextToken());
        long ten = 0;
        long fact = 10;
        while (d / fact > 0) {
            ten++;
            fact *= 10;
        }
        long potentialK = 1;
        for (int i = 0; i < (18 - ten); i++) {
            potentialK *= 10;
        }
        k = Math.min(k, potentialK);
        long a = 0;
        long b = k;
        long res = -1;
        while (a <= b) {
            long mid = (a + b) / 2;
            if (x - mid * d < 0) {
                res = mid;
                b = mid - 1;
            } else {
                a = mid + 1;
            }
        }

        if (res == -1) {
            out.println(x - k * d);
            out.close();
            return;
        }

        long value1 = x - res * d;
        long value2 = x - res * d + d;
        orgK -= res;
        if (orgK % 2 == 0) {
            out.println(Math.abs(value1));
        } else {
            out.println(Math.abs(value2));
        }

        out.close();
    }
}