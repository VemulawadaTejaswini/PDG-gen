import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] dp = new int[30];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 4;
        for (int i = 3; i < 30; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        Scanner sc = new Scanner(System.in);
        while (true)
        {
            int i = sc.nextInt();
            if (i == 0) break;

            System.out.println(dp[i-1]/3650+1);
        }
    }
}