import java.util.Scanner;

public class Main {
    static final long MOD = 1000000007;
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        long L = scanner.nextInt();
        long R = scanner.nextInt();
        if ((R - L) >= 1000) {
            System.out.println(0);
            return;
        }
        long ans = 1000000;
        for (long i = L; i < R; i++) {
            for (long j = i+1; j <= R; j++) {
                ans = Math.min(ans, (i*j) % 2019L);
            }
        }
        System.out.println(ans);
    }
}
