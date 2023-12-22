import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N+1000];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] dp = new int[N+1000];
        for (int i = 0; i <dp.length ; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[1] = 0;
        for (int i = 1; i <= N ; i++) {
            dp[i+1] =Math.min(dp[i+1], dp[i] +Math.abs(arr[i-1]-arr[i]));
            dp[i+2] =Math.min(dp[i+2], dp[i] +Math.abs(arr[i-1]-arr[i+1]));
        }
        System.out.println(dp[N]);
    }
}
