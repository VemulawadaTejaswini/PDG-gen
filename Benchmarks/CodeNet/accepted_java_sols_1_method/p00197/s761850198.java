import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      if (x == 0 && y == 0) {
        break;
      }
      if (x < y) {
        x = x + y;
        y = x - y;
        x = x - y;
      }
      int s = 1;
      for (;;) {
        x = x % y;
        x = x + y;
        y = x - y;
        x = x - y;
        if (y == 0) {
          System.out.printf("%d %d\n", x, s);
          break;
        } else {
          s++;
        }
      }
    }
  }
}