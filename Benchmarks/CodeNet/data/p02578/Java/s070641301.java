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

      int steps = 0;
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
        for (int i = maxIdx + 1; i < nextIdx; i++) {
          steps += (maxValue - a[i]);
          a[i] = maxValue;
        }
        nextIdx = maxIdx;
      }

      System.out.println(steps);
    }
  }
}
