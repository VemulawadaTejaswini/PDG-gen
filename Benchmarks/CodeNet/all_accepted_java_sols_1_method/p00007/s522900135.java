import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class Main {

  public static void main( String[] args ) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    BigDecimal cost = new BigDecimal(100000);
    BigDecimal thousand = new BigDecimal("1000");
    
    for (int i = 0; i < n; i++) {
      cost = cost.add(cost.multiply(new BigDecimal(0.05))).setScale(0, RoundingMode.FLOOR);
      cost = cost.divide(thousand)
              .setScale(0, RoundingMode.CEILING)
              .multiply(thousand);
    }
    System.out.println(cost);
  }
}