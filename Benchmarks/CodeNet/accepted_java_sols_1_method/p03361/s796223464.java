import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    char[][] s = new char[h][w];
    for (int i = 0; i < h; i++) {
      String t = sc.next();
      for (int j = 0; j < w; j++) {
        s[i][j] = t.charAt(j);
      }
    }

    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        if (s[i][j] == '.') {
          continue;
        }

        if ((i - 1) >= 0) {
          if (s[i - 1][j] == '#') {
            continue;
          }
        }

        if ((j - 1) >= 0) {
          if (s[i][j - 1] == '#') {
            continue;
          }
        }

        if ((i + 1) < h) {
          if (s[i + 1][j] == '#') {
            continue;
          }
        }

        if ((j + 1) < w) {
          if (s[i][j + 1] == '#') {
            continue;
          }
        }

        System.out.println("No");
        return;
      }
    }

    System.out.println("Yes");

  }
}