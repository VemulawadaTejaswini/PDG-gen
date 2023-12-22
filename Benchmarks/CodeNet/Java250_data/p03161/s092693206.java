
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int dpSolution(int n,int k,int a[]){
       int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = Math.abs(a[1]-a[2]);
        for(int i=3;i<=n;i++){
            int j= i-k;
            int val = Integer.MAX_VALUE;
            if(j<=0) {
                j = 1;
            }
            for(;j<i;j++){
                 val = Math.min(val,dp[j]+Math.abs(a[i]-a[j]));
                 //System.out.println(i+" "+j+" "+dp[j]+" "+val);

            }
            dp[i] = val;
        }
        return dp[n];
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n+1];
        for(int i=1;i<=n;i++){
            a[i] = sc.nextInt();
        }

        System.out.println(dpSolution(n,k,a));

    }
}
