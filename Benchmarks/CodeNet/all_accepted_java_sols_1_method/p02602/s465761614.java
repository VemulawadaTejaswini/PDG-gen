import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var line0 = br.readLine().split(" ");
      final var k = Integer.parseInt(line0[1]);
      final var a = Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();

      var mul = 1;
      for (int i = 0; i < a.length; i++) {
        if (i < k) {
          mul *= a[i];
          continue;
        }

        mul = mul * a[i] / a[i - k];
        if (i >= k) {
          System.out.println(a[i] > a[i - k] ? "Yes" : "No");
        }
      }
    }
  }
}
