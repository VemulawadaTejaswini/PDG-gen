import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var s = Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();
      final var a = s[0];
      final var b = s[1];
      final var c = s[2];
      final var x = s[3];
      final var y = s[4];

      var max = Integer.MAX_VALUE;
      final var len = Math.max(x, y);
      for (int i = 0; i <= len; i++) {
        var cost = a * Math.max(x - i, 0) + b * Math.max(y - i, 0) + c * 2 * i;
        max = Math.min(cost, max);
      }

      System.out.println(max);
    }
  }
}
