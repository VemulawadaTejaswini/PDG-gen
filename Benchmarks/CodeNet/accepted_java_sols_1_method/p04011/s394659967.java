import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var n = Integer.parseInt(br.readLine());
      final var k = Integer.parseInt(br.readLine());
      final var x = Integer.parseInt(br.readLine());
      final var y = Integer.parseInt(br.readLine());

      if (n <= k) {
        System.out.println(x * n);
      } else {
        System.out.println(x * k + y * (n - k));
      }
    }
  }
}
