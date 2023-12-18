import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      br.readLine();
      final var a = Arrays.stream(br.readLine().split(" "))
        .mapToLong(Long::parseLong)
        .toArray();
      final var sums = new long[a.length];
      sums[0] = a[0];
      for (int i = 1; i < a.length; i++) {
        sums[i] = sums[i - 1] + a[i];
      }

      long steps = 0;
      int nextIdx = a.length;
      while (nextIdx > 0) {
        int maxIdx = 0;
        long maxValue = 0;
        for (int i = 0; i < nextIdx; i++) {
          if (maxValue < a[i]) {
            maxValue = a[i];
            maxIdx = i;
          }
        }

        final var sum = (sums[nextIdx - 1] - sums[maxIdx]);
        final var sizeExpected = maxValue * (nextIdx - 1 - maxIdx);
        steps += (sizeExpected - sum);
        nextIdx = maxIdx;
      }

      System.out.println(steps);
    }
  }
}
