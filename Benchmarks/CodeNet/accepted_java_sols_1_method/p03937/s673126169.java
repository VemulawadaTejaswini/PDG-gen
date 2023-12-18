import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int h = sc.nextInt();
      int w = sc.nextInt();
      char[][] grid = new char[h][w];
      for(int i = 0; i < h; i++) {
        grid[i] = sc.next().toCharArray();
      }
      int cnt = 0;
      for(int i = 0; i < h; i++) {
        for(int j = 0; j < w; j++)
          if(grid[i][j] == '#')
            cnt++;
      }
      int row = 0, col = 0;
      int curCnt = 0;
      while(row < h && col < w && grid[row][col] != '.') {
        curCnt++;
        if(row+1 < h && grid[row+1][col] == '#')
          row++;
        else if(col+1 < w && grid[row][col+1] == '#')
          col++;
        else break;
      }
      System.out.println(cnt == curCnt ? "Possible" : "Impossible");
  }
}