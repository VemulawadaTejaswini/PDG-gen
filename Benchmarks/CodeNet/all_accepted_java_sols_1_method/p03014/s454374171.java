import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int h = sc.nextInt();
      int w = sc.nextInt();
      char[][] grid = new char[h][w];
      for(int i = 0; i < h; i++)
        grid[i] = sc.next().toCharArray();

      int[][][] count = new int[h][w][4];// 0:up 1:right 2:down 3:left
      // 3: left
      for(int i = 0; i < h; i++) {
        for(int j = 1; j < w; j++) {
          if(grid[i][j] == '#') continue;
          count[i][j][3] = count[i][j-1][3] + (grid[i][j-1] == '#' ? 0 : 1);
        }
      }
      // 1: right
      for(int i = 0; i < h; i++) {
        for(int j = w-2; j >= 0; j--) {
          if(grid[i][j] == '#') continue;
          count[i][j][1] = count[i][j+1][1] + (grid[i][j+1] == '#' ? 0 : 1);
        }
      }
      // 0: up
      for(int col = 0; col < w; col++) {
        for(int row = 1; row < h; row++) {
          if(grid[row][col] == '#') continue;
          count[row][col][0] = count[row-1][col][0] + (grid[row-1][col] == '#' ? 0 : 1);
        }
      }
      // 2: down
      for(int col = 0; col < w; col++) {
        for(int row = h-2; row >= 0; row--) {
          if(grid[row][col] == '#') continue;
          count[row][col][2] = count[row+1][col][2] + (grid[row+1][col] == '#' ? 0 : 1);
        }
      }
      int max = 0;
      for(int i = 0; i < h; i++) {
        for(int j = 0; j < w; j++) {
          if(grid[i][j] == '#') continue;
          max = Math.max(max, 1 + count[i][j][0] + count[i][j][1] + count[i][j][2] + count[i][j][3]);
        }
      }
      System.out.println(max);
  }
}