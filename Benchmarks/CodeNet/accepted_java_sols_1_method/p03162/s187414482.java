import java.util.Scanner;

public class Main {
    static long dp[][] = new long[100010][3];
    
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();

        int[][] a = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = std.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    // prohibit 2 days
                    if (j == k) {
                        continue;
                    }
                    dp[i + 1][k] = Math.max(dp[i + 1][k], dp[i][j] + a[i][j]);
                }
            }
        }
        
        long ans = 0;
        for (int i = 0; i < 3; i++) {
            ans = Math.max(dp[n][i], ans); 
        }
        
        System.out.println(ans);
    }
}
