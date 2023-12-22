import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int [] dp = new int [n];

        dp[n-1] = 0;

        for (int i = n - 2; i >= 0; i--) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 1 ; j <= k && j + i < n; j++) {
                dp[i] = Math.min(dp[i],(Math.abs(arr[i] - arr[i+j]) + dp[i+j]));
            }
        }
        System.out.println(dp[0]);
    }
}
