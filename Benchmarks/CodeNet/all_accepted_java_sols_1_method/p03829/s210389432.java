import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long[] ar = new long[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextLong();
        }
        long[] dp = new long[n];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.min(dp[i-1] + a * (ar[i] - ar[i-1]),
                    dp[i-1] + b);
        }
        System.out.println(dp[n-1]);
    }
}