import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var a = Arrays.stream(br.readLine().split(" "))
        .mapToLong(Long::parseLong)
        .toArray();

      System.out.println(
        Math.max(Math.max(Math.max(a[0] * a[2], a[1] * a[2]), a[0] * a[3]), a[1] * a[3])
      );
    }
  }
}
