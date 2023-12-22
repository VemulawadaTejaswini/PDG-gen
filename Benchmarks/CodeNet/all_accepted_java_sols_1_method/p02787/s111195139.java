import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int h = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n+1];
        int[] b = new int[n+1];
        for(int i = 1; i <= n; i++){
            a[i] = Integer.parseInt(sc.next());
            b[i] = Integer.parseInt(sc.next());
        }
    
        int[][] dp = new int[n+1][h+1];
        for(int i = 0; i <= n; i++){
            Arrays.fill(dp[i], Integer.MAX_VALUE/2);
            dp[i][0] = 0;
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= h; j++){
                dp[i][j] = Math.min(dp[i][Math.max(j-a[i], 0)] + b[i], dp[i-1][j]);
            }
        }
    
        System.out.println(dp[n][h]);
    }
}