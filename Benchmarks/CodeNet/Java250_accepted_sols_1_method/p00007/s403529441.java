import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    double debt = 100_000;
    while (input.ready()) {
      int weeks = Integer.valueOf(input.readLine());
      for (int i = 0; i < weeks; i++) {
        debt += debt * 0.05;
        double hasuu = debt % 1000;
        if (hasuu > 0) {
          debt += 1000 - hasuu;
        }
      }
      System.out.println((int) debt);
    }
  }

}