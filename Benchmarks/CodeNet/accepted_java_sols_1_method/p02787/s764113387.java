import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();

        int[] damage = new int[n];
        int[] mp = new int[n];

        for(int i = 0 ; i < n ; i++){
            damage[i] = sc.nextInt();
            mp[i] = sc.nextInt();
        }

        //HPが[]のときのMP消費最小値
        int[] dp = new int[h+1];
        dp[0] = 0;

        for(int i = 1 ; i <= h ; i++){
            dp[i] = (int)1e9;
            for(int j = 0 ; j < n ; j++){
                int remaining = Math.max(i-damage[j], 0);
                dp[i] = Math.min(dp[remaining] + mp[j], dp[i]);
            }
        }

        System.out.println(dp[h]);
    }
}
