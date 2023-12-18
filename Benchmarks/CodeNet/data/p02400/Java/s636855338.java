import java.io.*;
import java.math.*;

class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BigDecimal radius = new BigDecimal(br.readLine());
    BigDecimal pi = new BigDecimal(Math.PI);

    BigDecimal area = radius.multiply(radius).multiply(pi);
    area = area.setScale(6,BigDecimal.ROUND_HALF_UP);

    BigDecimal two = new BigDecimal(2);
    BigDecimal circumference = radius.multiply(two).multiply(pi);
    circumference = circumference.setScale(6,BigDecimal.ROUND_HALF_UP);

    System.out.println(area + " " + circumference);
  }
}

