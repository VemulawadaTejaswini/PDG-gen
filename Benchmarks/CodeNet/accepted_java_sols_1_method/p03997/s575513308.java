import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var a = Integer.parseInt(br.readLine());
      final var b = Integer.parseInt(br.readLine());
      final var h = Integer.parseInt(br.readLine());

      System.out.println((a + b) * h / 2);
    }
  }
}
