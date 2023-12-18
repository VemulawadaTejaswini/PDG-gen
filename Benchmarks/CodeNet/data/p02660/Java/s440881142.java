
import java.util.Scanner;

public class Main {

  public static void main(final String[] args) {
    final var scanner = new Scanner(System.in);
    long N = scanner.nextLong();

    if (isPrime(N)) {
      System.out.println(1);
      return;
    }

    long result = 0;
    for (long i = 2; i * i <= N; i++) {
      long tmp = 0;
      while (N % i == 0) {
        tmp++;
        N /= i;
      }

      long j = 1;
      while (j * (j + 1) / 2 <= tmp) {
        j++;
      }

      result += j - 1;
    }

    if (N != 1) {
      result++;
    }

    System.out.println(result);
  }

  public static boolean isPrime(final long N) {
    if (N > 2 && N % 2 == 0) {
      return false;
    }

    for (int i = 2; i <= Math.pow(N, 0.5d); i++) {
      if (N % i == 0) {
        return false;
      }
    }

    return true;
  }
}
