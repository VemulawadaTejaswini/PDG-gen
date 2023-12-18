import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int h = sc.nextInt();
      int w = sc.nextInt();
      int n = sc.nextInt();

      int[] colors = new int[n+1];
      for(int i = 1; i <= n; i++)
        colors[i] = sc.nextInt();

      int[][] grid = new int[h][w];
      int row = 0, col = 0;
      boolean isTowards = true;
      for(int i = 1; i <= n; i++) {
        int colorCnt = colors[i];
        while(colorCnt > 0) {
          colorCnt--;
          grid[row][col] = i;
          if(isTowards) col++;
          else col--;
          if(col == w) {
            isTowards = !isTowards;
            col = w - 1;
            row++;
          } else if(col == -1) {
            isTowards = !isTowards;
            col = 0;
            row++;
          }
        }
      }
      for(int i = 0; i < h; i++) {
        for(int j = 0; j < w; j++) {
          if(j == w - 1)
            System.out.println(grid[i][j]);
          else
            System.out.print(grid[i][j] + " ");
        }
      }
  }
}