
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] temp = in.nextLine().trim().split("\\s");
        int n = Integer.parseInt(temp[0]);
        int w = Integer.parseInt(temp[1]);
        int[] warr = new int[n];
        int[] varr = new int[n];
        for(int i = 0; i < n; i++){
            temp = in.nextLine().trim().split("\\s");
            warr[i] = Integer.parseInt(temp[0]);
            varr[i] = Integer.parseInt(temp[1]);
        } 
        long[][] dp = new long[n+1][w+1];
        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= w; j++){
                dp[i][j] = dp[i-1][j];
                if(j >= warr[i-1]){
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][j-warr[i-1]] + varr[i-1]);
                }
            }
        }
        
        System.out.println(dp[n][w]);
    }
}