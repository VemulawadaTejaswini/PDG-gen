import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mod = 998244353;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][]data = new int[k][2];
        for(int i = 0;i < k;i++){
            data[i][0] = sc.nextInt();
            data[i][1] = sc.nextInt() + 1;
        }
        long[]dp = new long[n];
        dp[0] = 1; dp[1] = -1;
        for(int i = 0;i < n;i++){
            if(i != 0)
            dp[i] = (dp[i] +  dp[i - 1] + mod) % mod;
            for(int j = 0;j < k;j++){
                int l = data[j][0] + i;
                int r = data[j][1] + i;
                if(l < n)
                    dp[l] = (dp[l] + dp[i] + mod) % mod;
                if(r < n)
                    dp[r] = (dp[r] - dp[i] + mod) % mod;
            }
        }
        System.out.println(dp[n - 1]);
    }
}
