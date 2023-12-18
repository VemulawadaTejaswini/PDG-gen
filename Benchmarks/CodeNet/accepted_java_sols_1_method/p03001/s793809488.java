import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long W = scanner.nextInt();
    long H = scanner.nextInt();
    int x = scanner.nextInt();
    int y = scanner.nextInt();

    System.out.printf("%f %d\n", W * H * 0.5d, (W % 2 == 0 && W / 2 == x && H % 2 == 0 && H / 2 == y) ? 1 : 0);
  }
}
