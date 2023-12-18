import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      br.readLine();
      final var n = Arrays.stream(br.readLine().split(" "))
        .mapToLong(Long::parseLong).toArray();

      var count = 0;
      for (int i = 0; i < n.length; i++) {
        if (i % 2 == 0 && n[i] % 2 == 1) {
          count++;
        }
      }

      System.out.println(count);
    }
  }
}
