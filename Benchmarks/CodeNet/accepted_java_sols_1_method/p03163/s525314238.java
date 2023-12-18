import java.util.Scanner;
public class Main {
    
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int capacity = sc.nextInt();
        int[] weight = new int[n];
        int[] value = new int[n];

        for(int ind = 0; ind < n; ind++) {
            weight[ind] = sc.nextInt();
            value[ind] = sc.nextInt();
        }

        long[][] dp = new long[n + 1][capacity + 1];

        for(int row = 1; row <= n; row++) {

            for(int col = 1; col <= capacity; col++) {

                long maxValue = dp[row - 1][col];
                if(col - weight[row - 1] >= 0) {
                    maxValue = Math.max(maxValue, dp[row - 1][col - weight[row - 1]] + value[row - 1]);
                }
                dp[row][col] = maxValue;
            }
        }

        System.out.println(dp[n][capacity]);
    }
}
