import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] H = new int[N+1];
        for(int i = 1; i < N+1; i++){
            H[i] = sc.nextInt();
        }
        sc.close();
        int[] dp = new int[N+1];
        dp[2] = Math.abs(H[2] - H[1]);
        for(int i = 3; i <= N; i++){
            dp[i] = Math.min(dp[i-2] + Math.abs(H[i] - H[i-2]), dp[i-1] + Math.abs(H[i] - H[i-1]));
        }
        System.out.println(dp[N]);

    }

}
