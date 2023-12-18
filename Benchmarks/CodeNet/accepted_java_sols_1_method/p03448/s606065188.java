import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int x = scanner.nextInt();

    int cnt = 0;
    for (int i = 0; i <= a && 500 * i <= x; i++) {
      for (int j = 0; j <= b && 100 * j <= x - 500 * i; j++) {
        int rem = x - 500 * i - 100 * j;
        if (rem >= 0 && rem / 50 <= c) cnt++;
      }
    }
    System.out.println(cnt);
  }
}
