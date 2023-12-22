import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      int h = scanner.nextInt();
      int w = scanner.nextInt();
      int last_h = h - 1;
      int last_w = w - 1;

      if (h == 0 && w == 0) break;

      String edge = "";
      String line = "";

      for (int j = 0; j < w; j++) {
        edge += "#";
        if (j == 0 || j == last_w) {
          line += "#";
        } else {
          line += ".";
        }
      }

      for (int i = 0; i < h; i++) {
        if (i == 0 || i == last_h) {
          System.out.println(edge);
        } else {
          System.out.println(line);
        }
      }
      System.out.println();
    }

    scanner.close();
  }
}