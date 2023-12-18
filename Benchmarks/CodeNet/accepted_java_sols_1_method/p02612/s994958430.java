import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
      final var br = new BufferedReader(stdin)) {
      final var n = Integer.parseInt(br.readLine());

      System.out.println(n % 1000 == 0 ? 0 : 1000 - (n % 1000));
    }
  }
}
