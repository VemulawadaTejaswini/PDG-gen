import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      br.readLine();
      final var a = Arrays.stream(br.readLine().split(" "))
          .mapToInt(Integer::parseInt)
          .toArray();
      final var q = Integer.parseInt(br.readLine());
      final var bc = new int[q][2];
      for (int i = 0; i < q; i++) {
        final var line = br.readLine().split(" ");
        bc[i][0] = Integer.parseInt(line[0]);
        bc[i][1] = Integer.parseInt(line[1]);
      }

      Map<Integer, Long> counts = new HashMap<>();
      for (int i = 0; i < a.length; i++) {
        counts.put(
            a[i],
            counts.containsKey(a[i]) ? counts.get(a[i]) + 1 : 1
        );
      }

      long sum = counts
          .entrySet()
          .stream()
          .mapToLong(entry -> entry.getKey() * entry.getValue())
          .sum();

      for (int i = 0; i < q; i++) {
        final long replaceCount = counts.containsKey(bc[i][0]) ?
                                  counts.get(bc[i][0]) :
                                  0L;

        if (replaceCount > 0) {
          counts.put(
              bc[i][1],
              counts.containsKey(bc[i][1]) ? counts.get(bc[i][1]) + replaceCount : replaceCount
          );
          counts.put(
              bc[i][0],
              0L
          );
        }

        sum += replaceCount * (bc[i][1] - bc[i][0]);

        System.out.println(sum);
      }
    }
  }
}
