import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        long res = 1000;
        for(int i = 1; i <= n; i++){
            dp[i] = sc.nextInt();
        }
        for(int i = 1; i < n; i++){
            if(dp[i] < dp[i + 1])
                res += res / dp[i] * (dp[i + 1] - dp[i]);
        }
        System.out.println(res);
    }
}