import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] input = br.readLine().split(" ");
    double n = Double.parseDouble(input[0]);
    double k = Double.parseDouble(input[1]);
    
    double result = 0;
    
    for(int i=1; i<=n; i++){
      int coin = k<=i ? 0 : BigDecimal.valueOf(Math.log(k/i)/Math.log(2)).setScale(0, RoundingMode.UP).intValue();
      result += Math.pow(0.5, coin)/n;
    }
    System.out.println(result);
  }
}