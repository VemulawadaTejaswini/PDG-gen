import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r,c;
        r = sc.nextInt();
        c = sc.nextInt();
        char grid[][] = new char[r][c];

        for(int i=0;i<r;i++){
                 grid[i] = sc.next().toCharArray();
        }

        int dp[][] = new int[r][c];

        dp[0][0] = 1;
        for(int i=1;i<r;i++){
            if(grid[i][0] == '#') dp[i][0] = 0;
            else dp[i][0] = dp[i-1][0];
        }

        for(int j=1;j<c;j++){
            if(grid[0][j] == '#') dp[0][j] = 0;
            else dp[0][j] = dp[0][j-1];
        }

        int modulo = (int) Math.pow(10,9) + 7;

        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(grid[i][j] == '#') dp[i][j] = 0;
                else{
                    int ans  = dp[i-1][j]%modulo + dp[i][j-1]%modulo;
                    dp[i][j] = ans%modulo;
                }
            }
        }

        System.out.println(dp[r-1][c-1]);
    }
}
