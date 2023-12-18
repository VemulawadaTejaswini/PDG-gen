import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    char[][] s = new char[H][W];
    int[][] c = new int[H][W];
    for (int i = 0; i < H; i++) {
      s[i] = sc.next().toCharArray();
    }
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (s[i][j] == '#') {
          continue;
        }
        int count = 0;
        if (i >= 1 && j >= 1 && s[i - 1][j - 1] == '#') {
          count++;
        }
        if (i >= 1 && s[i - 1][j] == '#') {
          count++;
        }
        if (i >= 1 && j < W - 1 && s[i - 1][j + 1] == '#') {
          count++;
        }
        if (j >= 1 && s[i][j - 1] == '#') {
          count++;
        }
        if (j < W - 1 && s[i][j + 1] == '#') {
          count++;
        }
        if (i < H - 1 && j >= 1 && s[i + 1][j - 1] == '#') {
          count++;
        }
        if (i < H - 1 && s[i + 1][j] == '#') {
          count++;
        }
        if (i < H - 1 && j < W - 1 && s[i + 1][j + 1] == '#') {
          count++;
        }
        c[i][j] = count;
      }
    }
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (s[i][j] == '#') {
          System.out.print("#");
        } else {
          System.out.print(c[i][j]);
        }
      }
      System.out.println();
    }
  }
}