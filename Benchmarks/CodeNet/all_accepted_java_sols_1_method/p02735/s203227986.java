import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        char[][] grid=new char[h][w];
        for(int i=0;i<h;i++)
        {
            grid[i]=sc.next().toCharArray();
        }
        int[][] dp=new int[h][w];

        if(grid[0][0]=='#'){
            dp[0][0]=1;
        }
        for(int i=1;i<h;i++)
        {
            dp[i][0]=Integer.MAX_VALUE;
            if(grid[i-1][0]==grid[i][0]||grid[i][0]=='.')
                dp[i][0]=Math.min(dp[i][0],dp[i-1][0]);
            else dp[i][0]=Math.min(dp[i][0],dp[i-1][0]+1);
        }
        for(int j=1;j<w;j++)
        {
            dp[0][j]=Integer.MAX_VALUE;
            if(grid[0][j-1]==grid[0][j]||grid[0][j]=='.')
                dp[0][j]=Math.min(dp[0][j],dp[0][j-1]);
            else dp[0][j]=Math.min(dp[0][j],dp[0][j-1]+1);
        }
        for(int i=1;i<h;i++)
            for(int j=1;j<w;j++)
            {
                dp[i][j]=Integer.MAX_VALUE;
                    if(grid[i-1][j]==grid[i][j]||grid[i][j]=='.')
                    dp[i][j]=Math.min(dp[i][j],dp[i-1][j]);
                    else dp[i][j]=Math.min(dp[i][j],dp[i-1][j]+1);

                    if(grid[i][j-1]==grid[i][j]||grid[i][j]=='.')
                        dp[i][j]=Math.min(dp[i][j],dp[i][j-1]);
                    else dp[i][j]=Math.min(dp[i][j],dp[i][j-1]+1);
            }

        System.out.println(dp[h-1][w-1]);
    }
}
