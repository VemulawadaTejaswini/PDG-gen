import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var k = Integer.parseInt(br.readLine());
      final var ab = Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();

      final var cand = (ab[0] / k) * k;
      if (cand >= ab[0] && cand <= ab[1]) {
        System.out.println("OK");
      } else if (cand + k >= ab[0] && cand + k <= ab[1]) {
        System.out.println("OK");
      } else {
        System.out.println("NG");
      }
    }
  }
}
