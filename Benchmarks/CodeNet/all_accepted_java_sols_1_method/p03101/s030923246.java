import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in);) {
      int H = sc.nextInt();
      int W = sc.nextInt();
      sc.nextLine();
      int h = sc.nextInt();
      int w = sc.nextInt();

      boolean[][] array = new boolean[H][W];

      for (int i = 0; i < h; i++) {
        for (int j = 0; j < W; j++) {
          array[i][j] = true;
        }
      }
      for (int i = 0; i < w; i++) {
        for (int j = 0; j < H; j++) {
          array[j][i] = true;
        }
      }
      int count = 0;
      for (int i = 0; i < H; i++) {
        for (int j = 0; j < W; j++) {
          if (array[i][j] == false) {
            count++;
          }
        }
      }

      System.out.println(count);
    }
  }
}