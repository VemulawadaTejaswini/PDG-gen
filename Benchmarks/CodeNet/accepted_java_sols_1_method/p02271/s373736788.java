import java.util.*;
import java.lang.Math;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int A[];
        A=new int[N];
        for(int i=0;i<N;i++) A[i]=sc.nextInt();
        boolean dp[][];
        dp=new boolean[N+1][2020];
        dp[0][0]=true;
        for(int i=0;i<N;i++){
            for(int j=0;j<=2000;j++){
                if(dp[i][j]){
                    dp[i+1][j]=true;
                    if(j+A[i]<=2000) dp[i+1][j+A[i]]=true;
                }
            }
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int m=sc.nextInt();
            System.out.println(dp[N][m]?"yes":"no");
        }
    }
}
