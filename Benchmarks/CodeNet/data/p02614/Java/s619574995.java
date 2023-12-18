import java.util.*;

public class Main {

  private static void solve(char[][] grid, int h, int w, int k) {
    int cnt = 0;
    for (int i = 0; i < (1 << h); i++) {
      for (int j = 0; j < (1 << w); j++) {
        if (check(grid, i, j, h, w, k)) {
          cnt++;
        }
      }
    }
    System.out.println(cnt);
  }

  private static boolean check(char[][] grid, int r, int c, int h, int w, int k) {
    int count = 0;
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        if ((r & (1 << i)) != 0 || (c & (1 << j)) != 0) {
          continue;
        }
        if (grid[i][j] == '#') {
          count++;
        }
      }
    }
    return count == k;
  }

  public static void main(String[] args) {
    int h = scanner.nextInt();
    int w = scanner.nextInt();
    int k = scanner.nextInt();
    char[][] grid = new char[h][w];
    for (int i = 0; i < h; i++) {
      String s = scanner.next();
      for (int j = 0; j < w; j++) {
        grid[i][j] = s.charAt(j);
      }
    }
    solve(grid, h, w, k);
  }

  private static final Scanner scanner = new Scanner(System.in);
}
