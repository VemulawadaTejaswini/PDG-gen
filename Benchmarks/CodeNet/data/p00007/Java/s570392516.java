import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Main {
  public static void main(String[] args) {

    new Main().run();
  }

  public void run() {

    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      int week = Integer.parseInt(br.readLine());

      int amount = 100_000;

      for (int i = 0; i < week; i++) {
        amount += amount * 0.05;
        if (amount % 1000 != 0) {
          amount = (amount / 1000) * 1000 + 1000;
        }
      }

      System.out.println(amount);
    } catch (IOException e) {
      System.err.println(e);
    }
  }
}
