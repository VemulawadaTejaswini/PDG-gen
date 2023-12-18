import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var s = br.readLine();
      final var regex = Pattern.compile("[AGCT]+");

      int count = 0;
      for (int i = 0; i < s.length(); i++) {
        for (int j = i + 1; j <= s.length(); j++) {
          final var sub = s.substring(i, j);
          if (regex.matcher(sub).matches()) {
            count = Math.max(sub.length(), count);
          }
        }
      }

      System.out.println(count);
    }
  }
}
