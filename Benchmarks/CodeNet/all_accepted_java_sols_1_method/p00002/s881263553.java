import java.util.*;
import java.math.*;
public class Main{
  public static void main(String agrs[]){
    Scanner sn = new Scanner(System.in);
    while(sn.hasNextBigInteger()){
    BigInteger a = sn.nextBigInteger(),
    b = sn.nextBigInteger();
    a = a.add(b);
    String s ="";
    s += a;
    System.out.println(s.length());
    }
  }
}