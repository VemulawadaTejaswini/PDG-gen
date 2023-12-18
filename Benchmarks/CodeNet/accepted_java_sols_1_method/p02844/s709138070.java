import java.util.*;

public class Main{
    public static final long INF = (int)1e9;
    public static int[][][] dp;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        char[] s = sc.next().toCharArray();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(""+s[i]);
        }
        
        dp = new int[n+1][4][1001];
        for(int i=0; i<n; i++){
            for(int j=2; j>=0; j--){
                for(int k=0; k<1000; k++){
                    if(j>0 && dp[i][j-1][k]==1 && k*10+a[i]<1000){
                        dp[i+1][j][k*10+a[i]] = 1;
                    }
                    if(dp[i][j][k]==1){
                        dp[i+1][j][k] = 1;
                    }
                }
            }
            dp[i+1][0][a[i]] = 1;
        }
        
        int ans = 0;
        for(int i=0; i<1000; i++){
            if(dp[n][2][i]>=1){
                //System.out.println(" :" + i);
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}

