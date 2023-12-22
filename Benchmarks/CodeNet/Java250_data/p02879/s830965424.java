import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      scanner.close();
      if (a < 1 || a > 9 || b < 1 || b > 9) {
          System.out.print("-1");
          return;
      }
      System.out.printf("%d", a * b);
  }
}
