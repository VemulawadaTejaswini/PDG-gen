import java.util.Scanner;

public class Main {

  public static void main(final String[] args) {
    final var scanner = new Scanner(System.in);
    final var A = scanner.next();
    final var B = scanner.next();

    int sum = 0;
    for (int i = 0; i < A.length(); i++) {
      if (A.charAt(i) != B.charAt(i)) {
        sum++;
      }
    }

    System.out.println(sum);
  }
}
