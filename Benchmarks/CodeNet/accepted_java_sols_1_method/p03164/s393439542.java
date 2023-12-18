import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int w = scn.nextInt();
        int[][] wav = new int[n+1][3]; //1 weight 2 value
        for(int i=1;i<=n;i++){
            wav[i][1] = scn.nextInt();
            wav[i][2] = scn.nextInt();
        }
        // System.out.println(1e5+1);
        //jth col ki val using 1...ith elemnets min in how much weight
        long[][] dp = new long[n+1][(int)(1e5+1)];
        for(int i=1;i<=n;i++){
            for(int val=1;val<=(int)Math.pow(10,5);val++){
                if(i==1){
                    dp[i][val] = (wav[1][2]==val?wav[1][1]:(int)1e9+1);
                }else{
                    long o1 = wav[i][2] <= val ? dp[i-1][val-wav[i][2]] + wav[i][1] : (int)1e9;
                    long o2 = dp[i-1][val];
                    dp[i][val] = Math.min(o1,o2);
                }
            }
        }
        
        long ans = 0;
        for(int val=1;val<=(int)1e5;val++){
            if(dp[n][val]<=w){
                ans = Math.max(ans,val);
            }
        }
        System.out.println(ans);
    }
}