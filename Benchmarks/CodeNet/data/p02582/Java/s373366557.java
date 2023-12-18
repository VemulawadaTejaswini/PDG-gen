import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var s = br.readLine();
      if (s.equals("RRR")) {
        System.out.println(3);
      } else if (s.contains("RR")) {
        System.out.println(2);
      } else if (s.contains("R")) {
        System.out.println(1);
      } else {
        System.out.println(0);
      }
    }
  }
}
