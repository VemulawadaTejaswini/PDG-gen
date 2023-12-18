import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
      final var br = new BufferedReader(stdin)) {
      final var s = br.readLine();
      final var t = br.readLine();

      var count = 0;
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) != t.charAt(i)) {
          count++;
        }
      }

      System.out.println(count);
    }
  }
}
