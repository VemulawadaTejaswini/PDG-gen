import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static long mod = (long)1e9+7;
    public static void main(String[] args) throws IOException {
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     String[] hw = reader.readLine().split(" ");
     int H = Integer.parseInt(hw[0]);
     int W = Integer.parseInt(hw[1]);
     char[][] list = new char[H][W];
     for (int i = 0; i <H ; i++) {
         char[] oi =reader.readLine().toCharArray();
         list[i] = oi;
     }
     long[][] dp = new long[H][W];
        for (int i = 0; i <H ; i++) {
            if(list[i][0]=='.') dp[i][0] = 1;
            else break;
        }
        for (int i = 0; i <W ; i++) {
            if(list[0][i]=='.') dp[0][i] = 1;
            else break;
        }
        for (int i = 1; i < H; i++) {
            for (int j = 1; j <W ; j++) {
                if(list[i][j]=='.') dp[i][j] = (dp[i-1][j]+dp[i][j-1])%mod;
                else dp[i][j]=0;
            }
        }
        System.out.println(dp[H-1][W-1]);
    }
}
