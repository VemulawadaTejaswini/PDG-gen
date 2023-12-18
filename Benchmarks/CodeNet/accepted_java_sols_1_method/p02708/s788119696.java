import java.util.Scanner;

public class Main {
    static final long mod = 1000000007L;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long k = in.nextLong();

        long total = 0;
        for (long i = k; i <= n + 1; i++) {
            total = (total + (i * (n - i + 1) % mod + 1)) % mod;
        }

        System.out.println(total);
    }
}
