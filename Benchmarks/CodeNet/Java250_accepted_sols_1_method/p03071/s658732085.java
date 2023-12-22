import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    final Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int result = 0;
    for (int i = 0; i < 2; i++) {
      if (a >= b) {
        result += a;
        a--;
      } else {
        result += b;
        b--;
      }
    }
    System.out.println(result);
  }
}