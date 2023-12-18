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
      int t = 0;
      int s = 0;
      for (;;) {
        x = x % y;
        t = x;
        x = y;
        y = t;
//System.out.printf("%d %d %d\n", x, y, s);
        if (y == 0) {
          System.out.printf("%d %d\n", x, s);
          break;
        } else {
          s++;
        }
        //s++;
      }
    }
  }
}