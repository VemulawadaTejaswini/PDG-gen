import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();int k=ob.nextInt();
        int INF = (int)1e9+7;
        int a[]=new int[n];
        for(int i=0;i<n;i++)a[i]=ob.nextInt();
        int dp[]=new int[n];
        for(int i=0;i<n;i++)dp[i]=INF;
        dp[0]=0;
        dp[1]=Math.abs(a[1]-a[0]);
        
        
        //System.out.println(Arrays.toString(a));
        //System.out.println(Arrays.toString(dp));
        
        for(int i=2;i<n;i++)
        {
            for(int j = Math.max(0,i-k);j<i;j++)
            {
                dp[i]=Math.min(dp[i],dp[j]+Math.abs(a[j]-a[i]));
            }
        }
        System.out.println(dp[n-1]);
        
        //System.out.println(Arrays.toString(dp));
        //System.out.println("Hello World!");
    }
}
