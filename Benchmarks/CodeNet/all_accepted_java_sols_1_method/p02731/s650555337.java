import java.io.*;
import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    
    System.out.println(BigDecimal.valueOf(n*n*n/27.0).toPlainString());
  }
}
