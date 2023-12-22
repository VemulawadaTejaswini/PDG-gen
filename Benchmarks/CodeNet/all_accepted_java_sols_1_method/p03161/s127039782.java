
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] dp = new int[n];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        dp[1] = Math.abs(arr[1]-arr[0]);
        for (int i = 2; i < n; i++) {
            for (int j = 1; j <=k ; j++) {
                if(j<=i)
                    dp[i] = Math.min(dp[i - j] + Math.abs(arr[i] - arr[i - j]), dp[i]);
            }
        }
        System.out.println(dp[n-1]);
    }
}
