import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var abc = br.readLine().split(" ");
      var a = Integer.parseInt(abc[0]);
      var b = Integer.parseInt(abc[1]);
      var c = Integer.parseInt(abc[2]);
      final var k = Integer.parseInt(br.readLine());

      var minCount = 0;
      while (a >= b) {
        b *= 2;
        minCount++;
      }
      while (b >= c) {
        c *= 2;
        minCount++;
      }

      System.out.println(minCount <= k ? "Yes" : "No");
    }
  }
}
