import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      long x = scanner.nextLong();
      long y = scanner.nextLong();
      if (x == 0 && y == 0) {
        break;
      }
      long t = 0;
      long s = 1;
      for (;;) {
        x = x % y;
        t = x;
        x = y;
        y = t;
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