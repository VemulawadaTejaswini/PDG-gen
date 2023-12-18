import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] pArr = new int[n*n];
      for(int i = 0; i < n*n; i++) {
        pArr[i] = sc.nextInt();
      }
      int[][][] grid = new int[n][n][4];
      for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
          grid[i][j][0] = i;
          grid[i][j][2] = n - 1 - i;
          grid[i][j][3] = j;
          grid[i][j][1] = n - 1 - j;
        }
      }
      int cnt = 0;
      for(int p : pArr) {
        int[] pos = pos(p, n);
        int row = pos[0], col = pos[1];
        int minCnt = Integer.MAX_VALUE;
        for(int d = 0; d < 4; d++) {
          minCnt = Math.min(minCnt, grid[row][col][d]);
        }
        cnt += minCnt;
        // up: 0
        for(int i = n-1; i > row; i--) {
          grid[i][col][0]--;
        }
        // down: 2
        for(int i = 0; i < row; i++) {
          grid[i][col][2]--;
        }
        // left: 3
        for(int i = n-1; i > col; i--) {
          grid[row][i][3]--;
        }
        // right: 1
        for(int i = 0; i < col; i++) {
          grid[row][i][1]--;
        }
      }
      System.out.println(cnt);
  }

  private static int[] pos(int p, int n) {
    p--;
    return new int[] {p / n, p % n};
  }
}