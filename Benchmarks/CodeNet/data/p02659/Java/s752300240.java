import java.util.*;
import java.math.BigInteger;
import java.math.*;
public class Main {
    public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
    BigInteger a = s.nextBigInteger();
     double b=s.nextDouble();
    
    
      BigDecimal tmp = new BigDecimal(a);
tmp = tmp.multiply(new BigDecimal(b));
BigInteger   i1 = tmp.toBigInteger();
       System.out.println(i1);
    }
}