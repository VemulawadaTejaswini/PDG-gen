import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0 ; i < n ; i++) {
            h[i] = sc.nextInt();
        }

        int[] dp = new int[n + 1];
        dp[2] = Math.abs(h[1] - h[0]);
        for (int i =3 ; i < n + 1; i++) {
            dp[i] = Math.min(dp[i - 2] + Math.abs(h[i - 1]-h[i-3]), dp[i - 1] + Math.abs(h[i - 1]-h[i -2]));
        }
        System.out.println(dp[n]);
    }

}