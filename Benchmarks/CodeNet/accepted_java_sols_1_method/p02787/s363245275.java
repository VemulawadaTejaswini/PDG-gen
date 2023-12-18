import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt();
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        int max=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
            max=Math.max(max,a[i]);
        }
        int[] dp=new int[h+max+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0]=0;
            for(int j=1;j<h+max+1;j++)
                for(int i=0;i<n;i++)
            {
               dp[j]=Math.min(dp[j],dp[Math.max(0,j-a[i])]+b[i]);
            }
        int res=Integer.MAX_VALUE;
            for(int j=h;j<h+max+1;j++)
            {
                res=Math.min(res,dp[j]);
            }
            System.out.println(res);
    }

}
