import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        Boolean[][] dp=new Boolean[101][101];
        boolean as = dfs(x,y,dp);
        System.out.println(as ? "Yes" : "No");
    }

    private static boolean dfs(int x, int y, Boolean[][] dp) {
        if(y < 0){
            return false;
        }
        if(x <= 0){
            return x == 0 && y == 0;
        }
        if(dp[x][y] != null) return dp[x][y];
        return dp[x][y] = dfs(x-1,y-2,dp) || dfs(x-1,y-4,dp);
    }
}
