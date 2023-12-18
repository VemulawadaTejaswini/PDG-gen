import java.util.*;
import java.math.BigInteger;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    while(sc.hasNextBigInteger()){
      BigInteger N = sc.nextBigInteger();
      BigInteger T = sc.nextBigInteger();
      char[] t = sc.next().toCharArray();

      BigInteger calc = N.pow(t[2] - '0');

      for(int i = 6; i < t.length; i += 4){
        calc = calc.add(N.pow(t[i] - '0'));
      }

      calc = calc.multiply(T);

      if(calc.compareTo(new BigInteger("1000000000")) <= 0){
        System.out.println(calc);
      }
      else{
        System.out.println("TLE");
      }
    }
  }
}