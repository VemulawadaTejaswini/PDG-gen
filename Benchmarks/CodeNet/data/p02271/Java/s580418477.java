import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++)A[i]=sc.nextInt();
        int q=sc.nextInt();
        int[] m=new int[q];
        for(int i=0;i<q;i++)m[i]=sc.nextInt();
        boolean[][][] dp=new boolean[q][n+10][2010];
        Arrays.sort(A);
        for(int i=0;i<q;i++)dp[i][0][0]=true;
        //mの要素分
        for(int i=0;i<q;i++){
            //dp使用
            for(int j=0;j<n;j++){
                for(int k=0;k<=m[i];k++){
                    dp[i][j+1][k]|=dp[i][j][k];
                    if(k>=A[j])dp[i][j+1][k]|=dp[i][j][k-A[j]];
                }
            }
            if(dp[i][n][m[i]])System.out.println("yes");
            else System.out.println("no");
        }
        sc.close();
    }
}
