import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int mod = 1000000007;
        char[][] c = new char[h][w];
        for(int i = 0; i < h; i++){
            String s = sc.next();
            for(int j = 0; j < w; j++){
                c[i][j] = s.charAt(j);
            }
        }
        long[][] dp = new long[h][w];
        dp[0][0] = 1;
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                if(i == 0 && j == 0) continue;
                else if(i == 0 && j > 0) dp[i][j] = dp[i][j-1];
                else if(j == 0 && i > 0) dp[i][j] = dp[i-1][j];
                else{
                    dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % mod;
                }
                if(c[i][j] == '#') dp[i][j] = 0;
            }
        }
        System.out.println(dp[h-1][w-1]);
    }
}