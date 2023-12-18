import java.util.*;
import java.math.BigInteger;

public class Main{
  static BigInteger lcm(BigInteger a, BigInteger b){
    return a.divide(a.gcd(b)).multiply(b);
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    while(true){
      int n = sc.nextInt();
      if(n == 0) break;

      BigInteger[] p = new BigInteger[n];
      BigInteger[] q = new BigInteger[n];

      BigInteger lm = BigInteger.ONE;

      for(int i = 0; i < n; i++){
        p[i] = sc.nextBigInteger();
        q[i] = sc.nextBigInteger();
        lm = lcm(q[i], lm);
      }

      BigInteger lm2 = BigInteger.ONE;

      for(int i = 0; i < n; i++){
        lm2 = lcm(lm2, p[i].multiply(lm.divide(q[i])));
      }

      for(int i = 0; i < n; i++){
        System.out.println(lm2.divide(p[i].multiply(lm.divide(q[i]))));
      }
    }
  }
}