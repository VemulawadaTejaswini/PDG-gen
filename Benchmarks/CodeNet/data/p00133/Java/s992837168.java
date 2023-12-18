import java.util.*;

class Main {
  public static void main (String[] args) {
    final int NUM = 8;
    Scanner scanner = new Scanner(System.in);
    char[][] in = new char[NUM][NUM];
    char[][] out = new char[NUM][NUM];
    while (scanner.hasNext()) {
      for (int row = 0; row < NUM; row++) {
        String line = scanner.nextLine();
        for (int col = 0; col < NUM; col++) {
          in[row][col] = line.charAt(col);
        }
      }
    }

    for (int ii = 90; ii < 360; ii += 90) {
      System.out.println(ii);
      for (int row = 0; row < NUM; row++) {
        for (int col = 0; col < NUM; col++) {
          out[col][NUM - 1 - row] = in[row][col];
        }
      }
      for (int row = 0; row < NUM; row++) {
        for (int col = 0; col < NUM; col++) {
          System.out.print(out[row][col]);
          in[row][col] = out[row][col];
        }
        System.out.println();
      }
    }
  }
}