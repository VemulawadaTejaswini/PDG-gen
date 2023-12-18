import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      int c = scanner.nextInt();
      if (c % 39 != 0) {
        System.out.printf("3C%02d\n", c % 39);
      } else {
        System.out.println("3C39");
      }
    }
  }
}