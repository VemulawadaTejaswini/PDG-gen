import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var x = Integer.parseInt(br.readLine());
      System.out.println(x >= 30 ? "Yes" : "No");
    }
  }
}
