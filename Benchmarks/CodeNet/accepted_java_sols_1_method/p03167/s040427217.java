import java.util.*;
 
public class Main{
  public static int[] dp;
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] s = sc.nextLine().split(" ");
    int H = Integer.parseInt(s[0]);
    int W = Integer.parseInt(s[1]);
    
    char[][] maze = new char[H][W];
    for(int i = 0; i < H; i++){
      String t = sc.nextLine();
      for(int j = 0; j < W; j++){
        maze[i][j] = t.charAt(j);
      }
    }
    
    int[][] dp = new int[H][W];
    dp[0][0] = 1;
    for(int i = 0; i < H; i++){
      for(int j = 0; j < W; j++){
        if(i < H-1 && maze[i+1][j] == '.'){
          dp[i+1][j] = (dp[i+1][j] + dp[i][j]) % 1000000007;
        }
        
        if(j < W-1 && maze[i][j+1] == '.'){
          dp[i][j+1] = (dp[i][j+1] + dp[i][j]) % 1000000007;
        }
      }
    }
    System.out.println(dp[H-1][W-1]);
  }
}
