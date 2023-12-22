import java.util.*;
import java.math.BigDecimal;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
	BigDecimal A = sc.nextBigDecimal();
    BigDecimal B = sc.nextBigDecimal();
    
    BigDecimal C = A.multiply(B);
    
    BigDecimal D = C.setScale(0, BigDecimal.ROUND_DOWN);
    System.out.println(D);
  }
}