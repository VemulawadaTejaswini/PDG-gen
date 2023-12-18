import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
      final var br = new BufferedReader(stdin)) {
      final var n = Integer.parseInt(br.readLine());

      int ac = 0;
      int wa = 0;
      int tle = 0;
      int re = 0;

      for (int i = 0; i < n; i++) {
        switch (br.readLine()) {
          case "AC":
            ac++;
            break;
          case "WA":
            wa++;
            break;
          case "TLE":
            tle++;
            break;
          case "RE":
            re++;
            break;
        }
      }

      System.out.println("AC x " + ac);
      System.out.println("WA x " + wa);
      System.out.println("TLE x " + tle);
      System.out.println("RE x " + re);
    }
  }
}
