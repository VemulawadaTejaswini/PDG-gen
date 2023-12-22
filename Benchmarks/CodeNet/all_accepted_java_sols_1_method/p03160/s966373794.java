import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        int[] dp = new int[n];
        //dp[0] = num[0];
        dp[1] = Math.abs(num[0] - num[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.min(dp[i - 1] + Math.abs(num[i] - num[i - 1]),
                    dp[i - 2] + Math.abs(num[i] - num[i - 2]));
        }

        System.out.println(dp[n-1]);


    }
}
 