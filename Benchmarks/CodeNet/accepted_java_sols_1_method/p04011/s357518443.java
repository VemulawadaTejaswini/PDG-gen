import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);

    final int n = scanner.nextInt();
    final int k = scanner.nextInt();
    final int x = scanner.nextInt();
    final int y = scanner.nextInt();

    if (k <= n) {
      System.out.println(k * x + (n - k) * y);
    } else {
      System.out.println(n * x);
    }
  }
}
