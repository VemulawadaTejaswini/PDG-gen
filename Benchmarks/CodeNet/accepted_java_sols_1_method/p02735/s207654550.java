import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();

        char[][] board = new char[H][W];
        for(int h=0; h<H; h++){
            board[h] = sc.next().toCharArray();
        }

        int[][] dp = new int[H][W];
        dp[0][0] = board[0][0] == '.' ? 0 : 1;
        for(int h=1; h<H; h++){
            dp[h][0] = dp[h-1][0];
            if(board[h-1][0]=='.' && board[h][0]=='#') dp[h][0]++;
        }
        for(int w=1; w<W; w++){
            dp[0][w] = dp[0][w-1];
            if(board[0][w-1]=='.' && board[0][w]=='#') dp[0][w]++;
        }
        for(int h=1; h<H; h++) for(int w=1; w<W; w++){
            int d = board[h-1][w]=='.' && board[h][w]=='#' ? 1+dp[h-1][w] : dp[h-1][w];
            int r = board[h][w-1]=='.' && board[h][w]=='#' ? 1+dp[h][w-1] : dp[h][w-1];
            dp[h][w] = Math.min(d,r);
        }

        System.out.println(dp[H-1][W-1]);
    }
}
