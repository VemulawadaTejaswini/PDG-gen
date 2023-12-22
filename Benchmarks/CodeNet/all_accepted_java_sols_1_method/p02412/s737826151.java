import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {
      while (true) {
        final int n, x;
        n = scanner.nextInt();
        x = scanner.nextInt();
        if (n == 0 && x == 0) {
          break;
        }
        int count = 0;
        for (int i = 1; i <= n - 2; i++) {
          if (i > x) {
            break;
          } else  if (i + 2 * n - 1 < x) {
            continue;
          }
          for (int j = i + 1; j <= n - 1; j++) {
            if (i + j > x) {
              break;
            } else if (i + j + n < x) {
              continue;
            }
            for (int k = j + 1; k <= n; k++) {
              if (i + j + k == x) {
                count++;
                break;
              }
            }
          }
        }
        System.out.println(count);
      }
    }

  }
}