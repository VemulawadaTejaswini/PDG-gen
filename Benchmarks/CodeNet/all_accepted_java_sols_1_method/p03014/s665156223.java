import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();
    char[][] map = new char[H][W];
    for (int i = 0; i < H; i++) map[i] = scanner.next().toCharArray();

    int[][] bxl = new int[H][W];
    int[][] bxr = new int[H][W];
    for (int i = 0; i < H; i++) {
      if (map[i][0] == '#') bxl[i][0] = 0;
      else bxl[i][0] = -1;
      for (int j = 1; j < W; j++) {
        if (map[i][j] == '#') bxl[i][j] = j;
        else bxl[i][j] = bxl[i][j - 1];
      }

      if (map[i][W - 1] == '#') bxr[i][W - 1] = W - 1;
      else bxr[i][W - 1] = W;
      for (int j = W - 2; j >= 0; j--) {
        if (map[i][j] == '#') bxr[i][j] = j;
        else bxr[i][j] = bxr[i][j + 1];
      }
    }
    int[][] byt = new int[H][W];
    int[][] byb = new int[H][W];
    for (int j = 0; j < W; j++) {
      if (map[0][j] == '#') byt[0][j] = 0;
      else byt[0][j] = -1;
      for (int i = 1; i < H; i++) {
        if (map[i][j] == '#') byt[i][j] = i;
        else byt[i][j] = byt[i - 1][j];
      }

      if (map[H - 1][j] == '#') byb[H - 1][j] = H - 1;
      else byb[H - 1][j] = H;
      for (int i = H - 2; i >= 0; i--) {
        if (map[i][j] == '#') byb[i][j] = i;
        else byb[i][j] = byb[i + 1][j];
      }
    }

    int max = 0;
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (map[i][j] == '.') {
          int xmax = bxr[i][j] - bxl[i][j] - 1;
          int ymax = byb[i][j] - byt[i][j] - 1;
          max = Math.max(max, xmax + ymax - 1);
        }
      }
    }
    System.out.println(max);
  }
}
