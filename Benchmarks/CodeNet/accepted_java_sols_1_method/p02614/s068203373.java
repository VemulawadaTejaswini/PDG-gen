import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int k = sc.nextInt();
    char[][] grid = new char[h][w];
    for (int cntH = 0; cntH < h; cntH++) {
      grid[cntH] = sc.next().toCharArray();
    }

    int ans = 0;
    for (int maskR = 0; maskR < Math.pow(2, h); maskR++) {
      for (int maskC = 0; maskC < Math.pow(2, w); maskC++) {
        int black = 0;
        for (int r = 0; r < h; r++) {
          for (int c = 0; c < w; c++) {
            if (grid[r][c] == '#' && ((maskR >> r) & 1) == 0 && ((maskC >> c) & 1) == 0) {
              black++;
            }
          }
        }
        if (black == k) {
          ans++;
        }
      }
    }
    System.out.println(ans);
    sc.close();
  }
}