import java.util.*;
import java.math.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      long a = sc.nextLong();
      BigInteger A = BigInteger.valueOf(a);

      long b = (long)(sc.nextDouble() * 100);
      BigInteger B = BigInteger.valueOf(b);

      BigInteger res = A.multiply(B);
      res = res.divide(new BigInteger("100"));
    
      System.out.println(res);
  }
}