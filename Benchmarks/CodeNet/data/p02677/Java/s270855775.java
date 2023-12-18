import java.util.Scanner;

public class Main {

  public static void main(final String[] args) {
    final Scanner scanner = new Scanner(System.in);

    final var A = scanner.nextDouble();
    final var B = scanner.nextDouble();
    final var H = scanner.nextDouble();
    final var M = scanner.nextDouble();

    // 角度を求める
    final var alpha = (2.0d * Math.PI) * (H / 12.0d);
    final var beta = (2.0d * Math.PI) * (M / 60.0d);
    final var theta = Math.abs(alpha - beta);

    final var C = Math.pow(A, 2) + Math.pow(B, 2) - 2.0d * A * B * Math.cos(theta);
    final var c = Math.sqrt(C);

    System.out.printf("%1.10f", c);
  }
}
