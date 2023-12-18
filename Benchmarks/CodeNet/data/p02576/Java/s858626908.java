import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final int[] s = Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();

      final var n = s[0];
      final var x = s[1];
      final var t = s[2];

      System.out.println(n % x == 0 ? (n / x) * t : ((n / x) + 1) * t);
    }
  }
}
