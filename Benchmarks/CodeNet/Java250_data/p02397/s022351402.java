import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    while (true) {
      int x = stdin.nextInt();
      int y = stdin.nextInt();
      if (x == 0 && y == 0) {
        break;
      } else if (x > y) {
        System.out.printf("%d %d%n", y, x);
      } else {
        System.out.printf("%d %d%n", x, y);
      }
    }
  }

}