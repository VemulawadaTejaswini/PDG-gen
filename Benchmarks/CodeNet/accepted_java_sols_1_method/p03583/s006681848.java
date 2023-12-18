import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    for (long h = 1; h <= 3500; h++) {
      for (long n = 1; n <= 3500; n++) {
        long a = N * h * n;
        long b = 4 * h * n - N * n - N * h;
        if (b <= 0) continue;
        if (a % b == 0) {
          System.out.printf("%d %d %d\n", h, n, a / b);
          return;
        }
      }
    }
  }
}
