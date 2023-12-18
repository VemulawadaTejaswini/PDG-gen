import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int H = scanner.nextInt();
    int W = scanner.nextInt();
    char a[][] = new char[H][W];
    boolean h[] = new boolean[H];
    boolean w[] = new boolean[W];

    scanner.nextLine();
    for (int i = 0; i < H; i++) {
      String line = scanner.nextLine();
      for (int j = 0; j < W; j++) {
          a[i][j] = line.charAt(j);
          if ( a[i][j] == '#') {
              h[i] = w[j] = true;
          }
      }
    }
    for (int i = 0; i < H; i++) {
      if (h[i] == false) {
        continue;
      }
      for (int j = 0; j < W; j++) {
        if (w[j] == false) {
          continue;
        }
        System.out.printf("%c", a[i][j]);
      }
      System.out.println("");
    }
  }
}