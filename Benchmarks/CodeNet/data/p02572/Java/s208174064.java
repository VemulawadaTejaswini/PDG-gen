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

      var modulo = (long)Math.pow(10, 9) + 7L;
      var sum = 0L;
      for (int i = 0; i < a.length - 1; i++) {
        for (int j = i + 1; j < a.length; j++) {
          sum = (sum + a[i] * a[j]) % modulo;
        }
      }

      System.out.println(sum);
    }
  }
}
