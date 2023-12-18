import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int h[] = new int[n];
        for(int i=0;i<n;i++)h[i]=sc.nextInt();

        long dp[]= new long[n];
        dp[0]=0;
        dp[1]=Math.abs(h[1]-h[0]);

        for(int i=2;i<n;i++){
            dp[i]=Long.MAX_VALUE;
            for(int j=1;j<Math.min(i,k)+1;j++){
                //System.out.println(i-j+" "+i);
                dp[i]=Math.min(dp[i],dp[i-j]+Math.abs(h[i-j]-h[i]));
            }
        }
        System.out.println(dp[n-1]);
    }
}
