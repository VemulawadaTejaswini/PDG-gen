import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();
    char[][] map = new char[H][W];
    for (int i = 0; i < H; i++) map[i] = scanner.next().toCharArray();

    boolean[] emptyH = new boolean[H];
    boolean[] emptyW = new boolean[W];
    int newH = H;
    int newW = W;
    for (int i = 0; i < H; i++) {
      emptyH[i] = true;
      for (int j = 0; j < W; j++) emptyH[i] &= map[i][j] == '.';
      if (emptyH[i]) newH--;
    }
    for (int i = 0; i < W; i++) {
      emptyW[i] = true;
      for (int j = 0; j < H; j++) emptyW[i] &= map[j][i] == '.';
      if (emptyW[i]) newW--;
    }
    char[][] res = new char[newH][newW];
    int ii = 0;
    for (int i = 0; i < H; i++) {
      if (!emptyH[i]) {
        int jj = 0;
        for (int j = 0; j < W; j++) {
          if (!emptyW[j]) {
            res[ii][jj] = map[i][j];
            jj++;
          }
        }
        ii++;
      }
    }
    for (int i = 0; i < newH; i++) {
      for (int j = 0; j < newW; j++) System.out.print(res[i][j]);
      System.out.println();
    }
  }
}
