import java.util.*;
public class Main{

     public static void main(String []args){
        Scanner in=new Scanner(System.in);
        
        int n=in.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=in.nextInt();
        }
        int dp[]=new int[n+1];
        dp[1]=0;
        dp[2]=Math.abs(A[1]-A[0]);
        for(int i=3;i<=n;i++)
        {
            dp[i]=Math.min(dp[i-2]+Math.abs(A[i-1]-A[i-3]),dp[i-1]+Math.abs(A[i-1]-A[i-2]));
        }
        System.out.println(dp[n]);
     }
}