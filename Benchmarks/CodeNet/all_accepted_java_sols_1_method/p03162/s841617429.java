import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        int N;
        Scanner in=new Scanner(System.in);
        N=in.nextInt();
        int[] a=new int[N];
        int[] b=new int[N];
        int[] c=new int[N];
        for(int i=0;i<N;i++){
            a[i]=in.nextInt();
            b[i]=in.nextInt();
            c[i]=in.nextInt();
        }
        int[][] dp=new int[N+1][3];
        dp[1][0]=a[0];
        dp[1][1]=b[0];
        dp[1][2]=c[0];
        for(int i=1;i<N;i++){
            dp[i+1][0]=a[i]+Math.max(dp[i][1],dp[i][2]);
            dp[i+1][1]=b[i]+Math.max(dp[i][0],dp[i][2]);
            dp[i+1][2]=c[i]+Math.max(dp[i][0],dp[i][1]);
        }
        System.out.println(Math.max(Math.max(dp[N][0],dp[N][1]),Math.max(dp[N][1],dp[N][2])));
    }
}