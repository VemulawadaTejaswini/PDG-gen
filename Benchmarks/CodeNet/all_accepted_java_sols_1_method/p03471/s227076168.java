import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int y = scanner.nextInt();
    int s = 10 * n - y / 1000;
    if (s >= 0) {
      for (int i = 0; i <= s / 9; i++) {
        if ((s - 9 * i) % 5 == 0) {
          int a = i;
          int b = (s - 9 * i) / 5;
          int c = n - a - b;
          if (c >= 0) {
            System.out.printf("%d %d %d\n", c, b, a);
            return;
          }
        }
      }
    }
    System.out.println("-1 -1 -1");
  }
}
