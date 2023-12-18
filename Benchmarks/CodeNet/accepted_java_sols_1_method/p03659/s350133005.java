import java.io.*;
import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());
    int[] an = new int[n];
    String[] data = br.readLine().split(" ");
    
    for (int i=0; i<n; i++){
      an[i] = Integer.parseInt(data[i]);
    }
    BigDecimal[] results = new BigDecimal[n-1];
    BigDecimal temp = new BigDecimal(0);
    BigDecimal sum = new BigDecimal(0);
    for (int i=0; i<n; i++){
      sum = sum.add(new BigDecimal(an[i]));
    }
    BigDecimal min = BigDecimal.valueOf(2 * Math.pow(10, 9));
    BigDecimal temp2;
    for (int i=0; i<n-1; i++){
      temp = temp.add(new BigDecimal(an[i]));
      temp2 = sum.subtract(temp.multiply(new BigDecimal(2))).abs();
      if (min.compareTo(temp2)>0){
        min = temp2;
      }
    }
    System.out.println(min.toPlainString());
  }
}
