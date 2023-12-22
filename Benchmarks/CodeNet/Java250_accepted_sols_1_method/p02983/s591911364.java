
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        long L = scanner.nextLong();
        long R = scanner.nextLong();
        if (R - L >= 2018L) {
            System.out.println(0);
            return;
        }
        long m1 = L  % 2019L;
        long m2 = R % 2019L;
        if (m1 > m2) {
            System.out.println(0);
            return;
        }
        long ans = 2019;

        for (long i = m1; i < m2; ++i) {
            for (long j = i + 1; j <= m2; ++j) {
                long current = ((i % 2019L) * (j) % 2019L) % 2019L;
                ans = Math.min(ans, current);
            }
        }
        System.out.println(ans);
    }
}
