import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int [] dp = new int [n];

        dp[n-1] = 0;
        dp[n-2] = Math.abs(arr[n-1] - arr[n-2]);

        for (int i = n - 3; i >= 0; i--) {
            dp[i] = Math.min(Math.abs(arr[i] - arr[i+1]) + dp[i+1],Math.abs(arr[i] - arr[i+2]) + dp[i+2]);
        }

        System.out.println(dp[0]);
    }
}
