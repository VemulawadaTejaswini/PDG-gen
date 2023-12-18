import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
  private static Map<String, Integer> memo = new HashMap<>();

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var n = Integer.parseInt(br.readLine());
      final var pow = Math.sqrt(n);
      final var result = new int[n];

      for (int i = 1; i < pow; i++) {
        for (int j = 1; j < pow; j++) {
          for (int k = 1; k < pow; k++) {
            final var sum = i * i + j * j + k * k + i * j + j * k + k * i;
            if (sum <= n) {
              result[sum - 1]++;
            }
          }
        }
      }

      for (int i = 0; i < result.length; i++) {
        System.out.println(result[i]);
      }
    }
  }
}
