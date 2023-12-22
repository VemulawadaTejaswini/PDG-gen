import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var nm = br.readLine().split(" ");
      final var n = Integer.parseInt(nm[0]);
      final var m = Integer.parseInt(nm[1]);
      final var s = new String[m];
      for (int i = 0; i < s.length; i++) {
        final var stringBuilder = new StringBuilder();
        stringBuilder.append("0".repeat(n));
        Arrays.stream(br.readLine().split(" "))
          .skip(1)
          .forEach((idx) -> stringBuilder
            .replace(Integer.parseInt(idx) - 1, Integer.parseInt(idx), "1"));

        s[i] = stringBuilder.toString();
      }

      final var p = Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();

      var size = 0;
      for (int i = 0; i < Math.pow(2, n); i++) {
        var ok = true;
        for (int j = 0; j < m; j++) {
          final var bin = Integer.toBinaryString(Integer.parseInt(s[j], 2) & i)
            .toCharArray();

          var countOne = 0;
          for (char c : bin) {
            if (c == '1') {
              countOne++;
            }
          }

          ok &= countOne % 2 == p[j];
        }

        if (ok) {
          size++;
        }
      }

      System.out.println(size);
    }
  }
}
