
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][] dp = new int[n + 1][3];

        for (int i = 1; i <= n; i++) {

            int[] act = new int[3];
            
            for (int j = 0; j < act.length; j++) {
                
                act[j] = in.nextInt();
                
            }
            
            for (int j = 0; j < act.length; j++) {
                
                dp[i][j] = Math.max(dp[i - 1][(j + 1) % 3], dp[i - 1][(j + 2) % 3]) + act[j];
            
            }
        }
        
        System.out.println(Arrays.stream(dp[n]).max().getAsInt());
        
    }

}
