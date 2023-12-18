import java.util.Scanner;

public class Main {
    private static final long MOD = 1000000007;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Long N = input.nextLong();
        Long K = input.nextLong();
        long min, max, sum = 0;
        for (long k = K; k <= N+1; k++) {
            min = k * (k - 1) / 2;
            max = (N * (N + 1) / 2) - ((N - k) * (N - k + 1) / 2);
            sum += max - min + 1;
        }

        System.out.println(sum % MOD);
    }
}
