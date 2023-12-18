import java.util.Scanner;

public class Main {

  public static void main(final String[] args) {
    final var scanner = new Scanner(System.in);

    final var K = scanner.nextInt();
    final var S = scanner.next();

    if (S.length() > K) {
      final var sub = S.substring(0, K);
      System.out.println(sub + "...");
    } else {
      System.out.println(S);
    }
  }
}
