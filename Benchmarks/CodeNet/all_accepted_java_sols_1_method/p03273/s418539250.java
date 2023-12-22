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
    for (int i = 0; i < H; i++) {
      emptyH[i] = true;
      for (int j = 0; j < W; j++) emptyH[i] &= map[i][j] == '.';
    }
    for (int i = 0; i < W; i++) {
      emptyW[i] = true;
      for (int j = 0; j < H; j++) emptyW[i] &= map[j][i] == '.';
    }
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) if (!emptyH[i] && !emptyW[j]) System.out.print(map[i][j]);
      System.out.println();
    }
  }
}
