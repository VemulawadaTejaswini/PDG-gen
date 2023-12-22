import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int p = Math.max((25 * A - 1) / 2 + 1, 10 * B);
    if (p >= 10 * B + 10 || 2 * p >= 25 * A + 25) {
      System.out.println(-1);
    } else {
      System.out.println(p);
    }
  }
}
