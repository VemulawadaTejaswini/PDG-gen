import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i] = sc.nextInt();
        }

        int dp[] = new int[n+1];
        dp[1] = 0;
        for(int i=2;i<=n;i++){
            int option1 = Math.abs(arr[i]-arr[i-1]) + dp[i-1];
            int option2 = (i == 2) ? Integer.MAX_VALUE :  Math.abs(arr[i]-arr[i-2]) + dp[i-2];
            dp[i] = Math.min(option1,option2);
        }

        System.out.println(dp[n]);

    }
}