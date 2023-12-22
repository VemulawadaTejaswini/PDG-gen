import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = Math.abs(h[1] - h[0]);
        for (int i = 2; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int count = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (count >= k) {
                    break;
                }
                min = Math.min(dp[j] + Math.abs(h[i] - h[j]), min);
                count++;
            }
            dp[i] = min;
        }
        System.out.println(dp[n - 1]);
    }

}
