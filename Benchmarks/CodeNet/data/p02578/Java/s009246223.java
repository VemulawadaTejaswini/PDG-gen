import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      br.readLine();
      final var a = Arrays.stream(br.readLine().split(" "))
        .mapToLong(Long::parseLong)
        .toArray();

      final List<Integer> decr = new ArrayList<>();
      final var sums = new long[a.length];
      sums[0] = a[0];
      for (int i = 1; i < a.length; i++) {
        sums[i] = sums[i - 1] + a[i];
        if (a[i] < a[i - 1]) {
          if (decr.isEmpty()) {
            decr.add(i - 1);
          } else {
            if (a[decr.get(decr.size() - 1)] < a[i - 1]) {
                decr.add(i - 1);
            }
          }
        }
      }
      
      long steps = 0;
      int nextIdx = a.length;
      for (int i = decr.size() - 1; i >= 0; i--) {
        int idx = decr.get(i);
        long maxValue = a[idx];
        int maxIdx = idx;

        final var sum = (sums[nextIdx - 1] - sums[maxIdx]);
        final var sizeExpected = maxValue * (nextIdx - 1 - maxIdx);
        steps += (sizeExpected - sum);
        nextIdx = maxIdx;
      }

      System.out.println(steps);
    }
  }
}
