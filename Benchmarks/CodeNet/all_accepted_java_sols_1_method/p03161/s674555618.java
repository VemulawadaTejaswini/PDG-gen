import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)arr[i] = scan.nextInt();
        scan.close();
        int[] dp = new int[n+1];
        Arrays.fill(dp,1000000005);
        dp[0] = 0;
        for(int i= 0;i<n;i++){
            for(int j=1;j<=k;j++){
                if(i+j < n)dp[i+j] = Math.min(dp[i+j],dp[i] + Math.abs(arr[i]- arr[i+j]));
            }
        }
        System.out.println(dp[n-1]);
        }
}
