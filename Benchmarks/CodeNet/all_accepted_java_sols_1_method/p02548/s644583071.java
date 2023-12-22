import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var n = Integer.parseInt(br.readLine());

      var sum = 0L;
      for (int i = 1; i < n; i++) {
        sum += (n - 1) / i;
      }

      System.out.println(sum);
    }
  }
}
