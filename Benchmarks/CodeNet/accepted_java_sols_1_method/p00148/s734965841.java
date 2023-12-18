import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      int c = scanner.nextInt() % 39;
      if (c == 0) {
        c = 39;
      }
      System.out.printf("3C%02d\n", c);
    }
  }
}