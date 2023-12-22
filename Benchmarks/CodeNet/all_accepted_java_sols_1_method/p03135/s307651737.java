import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigDecimal;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] strs = br.readLine().split(" ");
    BigDecimal T = new BigDecimal(strs[0]);
    BigDecimal X = new BigDecimal(strs[1]);
    System.out.println(T.divide(X, 4, BigDecimal.ROUND_UP));
  }
}