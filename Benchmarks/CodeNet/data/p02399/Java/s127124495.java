import java.io.*;
import java.math.*;

class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str_Numbers = br.readLine().split(" ");

    BigDecimal divident = new BigDecimal(str_Numbers[0]);
    BigDecimal divisor = new BigDecimal(str_Numbers[1]);
    BigDecimal int_quotient = divident.divide(divisor,BigDecimal.ROUND_HALF_UP);
    BigDecimal remainder = divident.remainder(divisor);
    BigDecimal real_quotient = divident.divide(divisor,5,BigDecimal.ROUND_HALF_UP);

    System.out.println(int_quotient + " " + remainder + " " + real_quotient);;
  }
}

