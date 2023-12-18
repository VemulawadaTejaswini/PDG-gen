import java.util.*;
import java.math.BigInteger;
 
public class Main {
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    BigInteger product = new BigInteger("1");
    BigInteger limit = new BigInteger("10^18"); 
    
    for (int i = 1; i <= N; i++) {
      int A_i = scan.nextInt();
      product = product.multiply(BigInteger.valueof(A_i));
      
      return;
    }
    
    if (product.compareTo(limit) > 0) {
      System.out.println(-1);
    }
	
	System.out.println(product);
  }
}