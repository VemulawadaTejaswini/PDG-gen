import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt(), c = scan.nextInt();
        scan.nextLine();
        char[][] grid = new char[r][c];
        for (int i = 0; i < r; i++)
        {
            String s = scan.nextLine();
            for (int j = 0; j < c; j++)
                grid[i][j] = s.charAt(j);
        }
        int[][] dp = new int[r][c];
        dp[0][0] = 1;
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                if (grid[i][j] == '#')
                    continue;
                if (i != 0)
                    dp[i][j] += dp[i - 1][j];
                if (j != 0)
                    dp[i][j] += dp[i][j - 1];
                dp[i][j] %= (int) 1e9  + 7;
            }
        }
        System.out.println(dp[r - 1][c - 1]);
    }
}