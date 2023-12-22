import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine().trim());
        int[][] arr = new int[n][3];
        int[][] dp = new int[n+1][3];
        int idx = 0;
        while(idx < n){
            String[] temp = in.nextLine().trim().split("\\s");
            arr[idx][0] = Integer.parseInt(temp[0]);
            arr[idx][1] = Integer.parseInt(temp[1]);
            arr[idx][2] = Integer.parseInt(temp[2]);
            idx++;
        }

        for(int i = 1; i <= n; i++){
            dp[i][0] = Math.max(dp[i-1][1]+arr[i-1][1], dp[i-1][2]+arr[i-1][2]);
            dp[i][1] = Math.max(dp[i-1][0]+arr[i-1][0], dp[i-1][2]+arr[i-1][2]);
            dp[i][2] = Math.max(dp[i-1][1]+arr[i-1][1], dp[i-1][0]+arr[i-1][0]);
        }
        System.out.println(Math.max(dp[n][0], Math.max(dp[n][1], dp[n][2])));
        
    }
}