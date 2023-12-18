import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var s = br.readLine().split(" ");
      final var n = Integer.parseInt(s[0]);
      final var k = Integer.parseInt(s[1]);

      final var nums = new ArrayList<Integer>();
      for (int i = 0; i < k; i++) {
        final var line = br.readLine().split(" ");
        final var start = Integer.parseInt(line[0]);
        final var end = Integer.parseInt(line[1]);
        for (int j = start; j <= end; j++) {
          nums.add(j);
        }
      }
      nums.sort(Integer::compareTo);

      var patterns = new long[n + 1];
      patterns[1] = 1;
      for (int i = 2; i < patterns.length; i++) {
        var sum = 0L;

        for (int num : nums) {
          if (num > i) break;

          sum = (sum + patterns[i - num]) % 998244353;
        }
        patterns[i] = sum;
      }

      System.out.println(patterns[n]);
    }
  }
}
