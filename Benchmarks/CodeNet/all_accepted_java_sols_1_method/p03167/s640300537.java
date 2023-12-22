import java.util.*;

public class Main {
    private static final int MOD = (int) (1e9+7);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h= scanner.nextInt();
        int w = scanner.nextInt();
        char[][] grid = new char[h][w];
        for(int i = 0 ; i < h ; ++i){
            grid[i] = scanner.next().toCharArray();
        }
        int[][] dp = new int[h+1][w+1];
        for(int i = h-1 ; i>=0 ; --i){
            for(int j = w-1 ; j>=0 ; --j){
                if(i==h-1&&j==w-1){
                    dp[i][j] =1;
                }else if(grid[i][j]=='#'){
                    dp[i][j] = 0;
                }else{
                    dp[i][j] = (dp[i+1][j] + dp[i][j+1])%MOD;
                }
            }
        }
        System.out.println(dp[0][0]);
    }
}