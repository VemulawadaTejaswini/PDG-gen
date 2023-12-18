import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  private static final long MAX = (long) Math.pow(10, 18);

  public static void main(final String[] args) {
    final var scanner = new Scanner(System.in);
    final long N = scanner.nextLong();
    final List<Long> A = new ArrayList<>();

    for (long i = 0; i < N; i++) {
      final long a = scanner.nextLong();
      if (a == 0L) {
        System.out.println(0);
        return;
      }

      A.add(a);
    }

    long result = 1;
    for (final Long a : A) {
      if (!(a < Long.MAX_VALUE / result)) {
        System.out.println(-1);
        return;
      }

      result *= a;
      if (result > MAX) {
        System.out.println(-1);
        return;
      }
    }

    System.out.println(result);
  }
}
