import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var nd = Arrays.stream(br.readLine().split(" "))
        .mapToLong(Long::parseLong)
        .toArray();

      int count = 0;
      for (int i = 0; i < nd[0]; i++) {
        final var line = br.readLine().split(" ");
        final var x = Long.parseLong(line[0]);
        final var y = Long.parseLong(line[1]);

        final var len2 = x * x + y * y;
        if (len2 <= nd[1] * nd[1]) {
          count++;
        }
      }

      System.out.println(count);
    }
  }
}
