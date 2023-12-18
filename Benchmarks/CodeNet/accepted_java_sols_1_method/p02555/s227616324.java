import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var s = Integer.parseInt(br.readLine());

      final var modulo = (long)Math.pow(10, 9) + 7;
      final var cache = new long[Math.max(s + 1, 6)];

      cache[3] = 1;
      cache[4] = 1;
      cache[5] = 1;

      for (int i = 6; i <= s; i++) {
        cache[i] = (cache[i - 1] + cache[i - 3]) % modulo;
      }

      System.out.println(cache[s]);
    }
  }
}
