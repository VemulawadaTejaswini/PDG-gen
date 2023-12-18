import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    int i = 1;
    while (true) {
      int x = stdin.nextInt();
      if (x == 0) {
        break;
      }
      System.out.printf("Case %d: %d%n", i++, x);
    }
  }

}