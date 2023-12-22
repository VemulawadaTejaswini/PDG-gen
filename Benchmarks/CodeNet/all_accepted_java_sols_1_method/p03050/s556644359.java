import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(reader.readLine());
        long max = (long) Math.sqrt(n);
        long sum = 0;
        // n = i * (m + 1)    (ただし 1 <= i < m)
        for (long i = 1; i <= max; i++) {
            if (n % i == 0) {
                long m = n / i - 1;
                if (i < m) {
                    sum += m;
                }
            }
        }
        System.out.println(sum);
    }
}
