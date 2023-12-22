import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var s = br.readLine().split(" ");
      var x = Long.parseLong(s[0]);
      final var k = Long.parseLong(s[1]);
      final var d = Long.parseLong(s[2]);

      if (x < 0) x = -x;

      final var div = x / d;
      if (div > k) {
        System.out.println(x - k * d);
        return;
      }

      final var restX = x - d * div;
      final var restK = k - div;
      final var restXOdd = Math.abs(restX - d);

      System.out.println(restK % 2 == 0 ? restX : restXOdd);
    }
  }
}
