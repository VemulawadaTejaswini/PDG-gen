import java.util.*;
import java.math.BigDecimal;
public class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    BigDecimal A = sc.nextBigDecimal();
		BigDecimal B = sc.nextBigDecimal();		
		BigDecimal ans = A.multiply(B);
		System.out.println(ans.toBigInteger());
  }
}  