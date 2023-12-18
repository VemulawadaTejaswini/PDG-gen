import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int[][][] house = new int[4][3][10];
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 3; j++) {
        for (int k = 0; k < 10; k++) {
          house[i][j][k] = 0;
        }
      }
    }
    int n = in.nextInt();
    for (int i = 0; i < n; i++) {
      int b = in.nextInt();
      int f = in.nextInt();
      int r = in.nextInt();
      int v = in.nextInt();
      house[b - 1][f - 1][r - 1] += v;
    }
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 3; j++) {
        for (int k = 0; k < 10; k++) {
          System.out.print(" " + house[i][j][k]);
        }
        System.out.println();
      }
      System.out.println("####################");
    }
  }
}