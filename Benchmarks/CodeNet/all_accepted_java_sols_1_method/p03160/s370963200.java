import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int[] h = new int[N];
        int[] dp = new int[N];
        int MAX_H = 10001;
        for (int i = 0; i < N; i++) {
            h[i] = Integer.parseInt(sc.next());
            dp[i] = MAX_H;
        }

        dp[0] = 0;
        dp[1] = Math.abs(h[0] - h[1]);
        for (int i = 2; i < N; i++) {
            int min1 = dp[i - 1] + Math.abs(h[i - 1] - h[i]);
            int min2 = dp[i - 2] + Math.abs(h[i - 2] - h[i]);
            dp[i] = Math.min(min1, min2);
        }

        System.out.println(dp[N - 1]);
    }
}

