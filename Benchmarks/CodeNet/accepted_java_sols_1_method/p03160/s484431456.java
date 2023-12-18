
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];

        for(int i=0;i<n;i++){
            input[i] = sc.nextInt();
        }

        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for(int i=1;i<n;i++){
            dp[i] = Math.min(dp[i],dp[i-1] + Math.abs(input[i] - input[i-1]));
            if(i>1){
                dp[i] = Math.min(dp[i],dp[i-2] + Math.abs(input[i] - input[i-2]));
            }
        }
        
        System.out.println(dp[n-1]);

    }

}
