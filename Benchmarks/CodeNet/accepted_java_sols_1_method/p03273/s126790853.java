import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    String[] height = new String[H];
    String[] width = new String[W];
    char[][] grid = new char[H][W];
    boolean[] checkHeight = new boolean[H];
    boolean[] checkWidth = new boolean[W];
    
    for (int i = 0; i < H; i++) {
      height[i] = sc.next();
      if (!height[i].contains("#")) {
        checkHeight[i] = true;
      }
      for (int j = 0; j < W; j++) {
        width[j] += height[i].substring(j, j + 1);
        grid[i][j] = height[i].charAt(j);
      }
    }
    for (int j = 0; j < W; j++) {
      if (!width[j].contains("#")) {
        checkWidth[j] = true;
      }
    }
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (checkHeight[i] || checkWidth[j]) {
          continue;
        }
        System.out.print(grid[i][j]);
      }
      if (checkHeight[i]) {
        continue;
      }
      System.out.println("");
    }
  }
}