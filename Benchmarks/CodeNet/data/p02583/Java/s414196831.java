import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      br.readLine();
      final var l = Arrays.stream(br.readLine().split(" "))
        .mapToLong(Long::parseLong)
        .toArray();

      var count = 0;
      for (int i = 0; i < l.length; i++) {
        for (int j = i + 1; j < l.length; j++) {
          for (int k = j + 1; k < l.length; k++) {
            if (l[i] == l[j] || l[j] == l[k] || l[k] == l[i]) continue;

            final var l0 = Math.min(Math.min(l[i], l[j]), l[k]);
            final var l2 = Math.max(Math.max(l[i], l[j]), l[k]);
            final var l1 = l[i] + l[j] + l[k] - l0 - l2;

            if (l0 + l1 <= l2) continue;

            count++;
          }
        }
      }

      System.out.println(count);
    }
  }
}
