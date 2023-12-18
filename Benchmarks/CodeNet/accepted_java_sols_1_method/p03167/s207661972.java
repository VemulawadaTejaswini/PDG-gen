import java.util.*;

public class Main {
    private static final int MOD = (int) (1e9+7);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        char[][] grid = new char[rows][columns];
        for(int i = 0; i< rows; ++i){
            grid[i] =scanner.next().toCharArray();
        }
        int[][] dp = new int[rows][columns];
        dp[0][0] = 1;
        for(int i = 0; i< rows; ++i){
            for(int j = 0; j< columns; ++j){
                if(i>0) dp[i][j] += dp[i-1][j];
                if(j>0) dp[i][j] += dp[i][j-1];
                if(grid[i][j]=='#') dp[i][j]=0;
                dp[i][j]%=MOD;
            }
        }
        System.out.println(dp[rows -1][columns -1]);
    }
}
