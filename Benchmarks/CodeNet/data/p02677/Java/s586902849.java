import java.util.Scanner;

public class Main {

  public static void main(final String[] args) {
    final Scanner scanner = new Scanner(System.in);

    final var A = scanner.nextDouble();
    final var B = scanner.nextDouble();
    final var H = scanner.nextDouble();
    final var M = scanner.nextDouble();

    final var alpha = (2.0d * Math.PI) * (H / 12.0d)
        + (2.0d * Math.PI) * (1.0d / 12.0d) * (M / 60.d);
    final var beta = (2.0d * Math.PI) * (M / 60.0d);
    final var theta = Math.abs(alpha - beta);

    if (Double.compare(theta, 0.0d) == 0) {
      System.out.printf("%1.12f\n", Math.abs(A - B));
      return;
    }

    if (Double.compare(theta, Math.PI) == 0) {
      System.out.printf("%1.12f\n", A + B);
    } else {
      final var gamma = theta > Math.PI ? 2 * Math.PI - theta : theta;
      final var C = Math.pow(A, 2) + Math.pow(B, 2) - 2.0d * A * B * Math.cos(gamma);
      final var c = Math.sqrt(C);

      System.out.printf("%1.12f\n", c);
    }
  }
}
