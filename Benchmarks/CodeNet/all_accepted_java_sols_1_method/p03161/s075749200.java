import java.util.Arrays;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] h = new int[N];
        int[] dp = new int[N];

        for (int i = 0; i < N; i++) {
            h[i] = sc.nextInt();
        }

        sc.close();

        Arrays.fill(dp, (int)2e9);
        dp[0] = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 1; j <= K; j++) {
                if (i + j < N) {
                    dp[i+j] = Math.min(dp[i+j], dp[i] + Math.abs(h[i] - h[i+j]));
                }
            }
        }

        System.out.println(dp[N-1]);
    }

}