import java.util.Scanner;
import java.math.BigDecimal;
import java.math.BigInteger;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    BigDecimal A = scan.nextBigDecimal();
    BigDecimal B = scan.nextBigDecimal();
    BigDecimal ANS = new BigDecimal("1");
    ANS = A.multiply(B);
    BigDecimal ans = ANS.setScale(0, BigDecimal.ROUND_DOWN);
    System.out.println(ans);
  }
}


