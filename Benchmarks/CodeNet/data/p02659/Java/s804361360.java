import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Long A = sc.nextLong();
    Double B = sc.nextDouble();
    BigDecimal ad = new BigDecimal(String.valueOf(A));
    BigDecimal bd = new BigDecimal(String.valueOf(B));
    BigDecimal bd3 = bd.setScale(2, RoundingMode.DOWN);
    BigDecimal bd4 = ad.multiply(bd3);
    System.out.println(bd4.setScale(0, RoundingMode.DOWN));

  }

  
}