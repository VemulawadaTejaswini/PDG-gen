import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        final long N = sc.nextLong();
        long ans = Long.MAX_VALUE;
        for (long i = 1; i < Math.sqrt(N) + 1; i++) {
            if (N % i != 0) {
                continue;
            }
            long div = N / i;
            ans = Math.min(ans, (div-1)+(i-1));
        }
        System.out.println(ans);
    }
}
