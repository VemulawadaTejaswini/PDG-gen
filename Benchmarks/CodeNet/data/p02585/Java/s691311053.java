import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var s = br.readLine().split(" ");
      final var n = Integer.parseInt(s[0]);
      final var k = Integer.parseInt(s[1]);
      final var p = Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();
      final var c = Arrays.stream(br.readLine().split(" "))
        .mapToLong(Long::parseLong)
        .toArray();

      var maxValue = Long.MIN_VALUE;
      final var prevScores = new long[n];
      for (int i = 0; i < n; i++) {
        prevScores[i] = 0;
      }
      for (int j = 1; j < k + 1; j++) {
        final var scores = new long[n];
        for (int i = 0; i < n; i++) {
          scores[i] = c[i] + prevScores[p[i] - 1];
          maxValue = Math.max(maxValue, scores[i]);
        }
        for (int i = 0; i < n; i++) {
          prevScores[i] = scores[i];
        }
      }

      System.out.println(maxValue);
    }
  }
}
