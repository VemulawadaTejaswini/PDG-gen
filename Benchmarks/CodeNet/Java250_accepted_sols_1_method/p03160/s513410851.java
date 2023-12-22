import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine().trim());
        int[] h = new int[n];
        int count = 0;
        for(String a : in.nextLine().trim().split("\\s")){
            h[count++] = Integer.parseInt(a);
        }
        int[] dp = new int[n];
        for(int i = 1; i < n; i++){
            int cost = Integer.MAX_VALUE;
            if(i-2 > -1){
                cost = dp[i-2] + Math.abs(h[i]-h[i-2]);
            }
            dp[i] = Math.min(cost,dp[i-1] + Math.abs(h[i]-h[i-1]));
        }
        System.out.println(dp[n-1]);
    }
}