import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

  private static final int[] dx = { 1, 1, 0, -1, -1, -1, 0, 1 };
  private static final int[] dy = { 0, 1, 1, 1, 0, -1, -1, -1 };

  private static void dfs(int i, int j, boolean[][] isLand, int H, int W) {
    isLand[i][j] = false;
    for (int k = 0; k < 8; k++) {
      int ci = i + dx[k];
      int cj = j + dy[k];
      if (0 <= ci && ci < H && 0 <= cj && cj < W && isLand[ci][cj]) {
        dfs(ci, cj, isLand, H, W);
      }
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Integer> list = new ArrayList<>();
    while (true) {
      int W = scanner.nextInt();
      int H = scanner.nextInt();
      if (W == 0 && H == 0) {
        break;
      }
      boolean[][] isLand = new boolean[H][W];
      for (int i = 0; i < H; i++) {
        for (int j = 0; j < W; j++) {
          isLand[i][j] = scanner.nextInt() == 1;
        }
      }
      int ans = 0;
      for (int i = 0; i < H; i++) {
        for (int j = 0; j < W; j++) {
          if (isLand[i][j]) {
            ans++;
            dfs(i, j, isLand, H, W);
          }
        }
      }
      list.add(ans);
    }
    for (Integer integer : list) {
      System.out.println(integer);
    }
  }
}

