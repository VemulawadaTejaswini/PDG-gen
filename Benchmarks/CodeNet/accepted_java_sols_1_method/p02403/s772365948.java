import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      int h = scanner.nextInt();
      int w = scanner.nextInt();

      if (h == 0 && w == 0) break;

      for (int i = 0; i < h; i++) {
        String line = "";
        for (int j = 0; j < w; j++) {
          line += "#";
        }
        System.out.println(line);
      }
      System.out.println();
    }

    scanner.close();
  }
}