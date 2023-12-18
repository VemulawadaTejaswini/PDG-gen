import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      int countEightDivisor = 0;

      for (int i = 1; i <= N; i += 2) {
        int divisorCount = 0;

        for (int d = 1; d <= i; ++d) {
          if (i % d == 0) {
            ++divisorCount;
          }
        }

        if (divisorCount == 8) {
          ++countEightDivisor;
        }
      }

      System.out.println(countEightDivisor);
    }
  }
}