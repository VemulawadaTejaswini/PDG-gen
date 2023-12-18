import java.util.*;
import java.math.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    BigInteger A = sc.nextBigInteger();
    float B = sc.nextFloat();
	int B100 = (int)(B * 100);
    
    System.out.println(A.multiply(BigInteger.valueOf(B100)).divide(BigInteger.valueOf(100)));
  }
}