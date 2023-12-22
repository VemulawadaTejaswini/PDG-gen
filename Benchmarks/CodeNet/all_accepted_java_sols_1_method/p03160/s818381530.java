import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        int dp[] = new int[n];
        dp[0] = 0;
        for(int i = 1 ; i < n ; i++){
            dp[i] = dp[i-1] + Math.abs(arr[i]-arr[i-1]);
            if(i-2 >= 0){
                dp[i] = Math.min(dp[i],dp[i-2] + Math.abs(arr[i] - arr[i-2]));
            }
        }
        System.out.println(dp[n-1]);
    }
}