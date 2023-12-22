import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] temp = in.nextLine().trim().split("\\s");
        int n = Integer.parseInt(temp[0]);
        int k = Integer.parseInt(temp[1]);
        
        int[] h = new int[n];
        int count = 0;
        for(String a : in.nextLine().trim().split("\\s")){
            h[count++] = Integer.parseInt(a);
        }
        // System.out.println(Arrays.toString(h));
        int[] dp = new int[n];
        for(int i = 1; i < n; i++){
            dp[i] = Integer.MAX_VALUE;
            for(int j = 1; j <= k; j++){
                if(i-j >= 0){
                    dp[i] = Math.min(dp[i], dp[i-j] + Math.abs(h[i]-h[i-j]));
                }
            }
        }
        System.out.println(dp[n-1]);
    }
}