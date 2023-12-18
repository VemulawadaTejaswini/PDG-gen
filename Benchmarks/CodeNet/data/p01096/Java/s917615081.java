import java.util.*;
import java.io.*;

public class Main{

    static int[][] dp;
    public static void main(String[] args){
        Scanner ir=new Scanner(System.in);
        outer:
        for(;;){
            int n=ir.nextInt();
            if(n==0){
                System.exit(0);
            }
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=ir.nextInt();
            }
            dp=new int[n][n];
            int MIN=-(1<<30);
            for(int i=0;i<n;i++){
                Arrays.fill(dp[i],MIN);
                dp[i][i]=0;
            }
            System.out.println(dfs(0,n-1,a));
        }
    }

    static int dfs(int l,int r,int[] a){
        if(l>=r){
            return 0;
        }
        if(dp[l][r]>=0){
            return dp[l][r];
        }
        int res=dfs(l+1,r,a);
        for(int i=l+1;i<=r;i++){
            if(Math.abs(a[l]-a[i])<=1&&dfs(l+1,i-1,a)==i-l-1){
                res=Math.max(res,2+dfs(l+1,i-1,a)+dfs(i+1,r,a));
            }
        }
        return dp[l][r]=res;
    }
}
