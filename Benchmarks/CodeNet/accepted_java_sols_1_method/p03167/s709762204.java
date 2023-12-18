import java.util.*;

public class Main {

    static List<List<Integer>> edges = new ArrayList<>();
    static int[] dp = null;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();

        char[][] grid = new char[H][W];
        for (int i = 0; i < H; i++) {
            String s = sc.next();
            for (int j = 0; j < s.length(); j++) {
                grid[i][j]=s.charAt(j);
            }
        }


        long[][] dp = new long[H+1][W+1];

        int ans = 0;
        for (int i = 1; i <= H; i++) {
            for (int j = 1; j <= W; j++) {
                if(i==1 && j==1){
                    dp[i][j]=1;
                    continue;
                }
                if(grid[i-1][j-1]=='.'){
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                    dp[i][j] %= 1_000_000_007;
                }
            }
        }

        System.out.println(dp[H][W]);
    }

}
