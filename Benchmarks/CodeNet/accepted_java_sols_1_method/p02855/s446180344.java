import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int h = sc.nextInt();
      int w = sc.nextInt();
      int k = sc.nextInt();

      char[][] grid = new char[h][w];
      for(int i = 0; i < h; i++)
        grid[i] = sc.next().toCharArray();

      int[] cnt = new int[h];
      for(int i = 0; i < h; i++) {
        for(int j = 0; j < w; j++)
          if(grid[i][j] == '#') cnt[i]++;
      }

      int[][] res = new int[h][w];
      int curK = 1;
      for(int i = 0; i < h; i++) {
        if(cnt[i] == 0) continue;
        int rowCnt = cnt[i];
        for(int j = 0; j < w; j++) {
          if(rowCnt == 0)
            res[i][j] = curK - 1;
          else
            res[i][j] = curK;
          if(grid[i][j] == '#') {
            curK++;
            rowCnt--;
          }
        }
      }
      int nonEmptyRow = h - 1;
      for(; nonEmptyRow >= 0; nonEmptyRow--) {
        if(cnt[nonEmptyRow] > 0) break;
      }
      for(int i = nonEmptyRow; i < h - 1; i++) {
        if(cnt[i+1] > 0) continue;
        for(int j = 0; j < w; j++) {
          res[i+1][j] = res[i][j];
        }
      }
      for(int i = nonEmptyRow; i >= 1; i--) {
        if(cnt[i-1] > 0) continue;
        for(int j = 0; j < w; j++)
          res[i-1][j] = res[i][j];
      }
      for(int i = 0; i < h; i++)
        for(int j = 0; j < w; j++)
            if(j == w - 1)
                System.out.println(res[i][j]);
            else
                System.out.print(res[i][j] + " ");
  }
}