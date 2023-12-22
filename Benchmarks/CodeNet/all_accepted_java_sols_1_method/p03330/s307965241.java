import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int c = sc.nextInt();
      int[][] colors = new int[c][c];
      for(int i = 0; i < c; i++)
        for(int j = 0; j < c; j++)
          colors[i][j] = sc.nextInt();

      long[][] sum = new long[3][c];
      int[][] grid = new int[n][n];
      for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
          grid[i][j] = sc.nextInt() - 1;
          for(int k = 0; k < c; k++)
            sum[(i + j) % 3][k] += colors[grid[i][j]][k]; 
        }
      }

      long res = Long.MAX_VALUE;
      for(int i = 0; i < c; i++) {
        for(int j = 0; j < c; j++) {
          if(i == j) continue;
          for(int k = 0; k < c; k++) {
            if(k == j || k == i) continue;
            res = Math.min(res, sum[0][i] + sum[1][j] + sum[2][k]);
          }
        }
      }

      System.out.println(res);
  }
}