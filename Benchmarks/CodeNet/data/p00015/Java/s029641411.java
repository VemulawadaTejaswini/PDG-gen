import java.util.Scanner;
import java.util.Vector;
import java.math.BigInteger;

class Main{
  public static void main(String[] av) throws Exception{
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    while(sc.hasNextBigInteger()){
      BigInteger bi1 = sc.nextBigInteger();
      BigInteger bi2 = sc.nextBigInteger();
      if ( 80 < bi1.toString().length() || 80 < bi2.toString().length() ){
        System.out.println("overflow");
        continue;
      }
      BigInteger sum = bi1.add(bi2);
      if ( 80 < sum.toString().length() ){
        System.out.println("overflow");
        continue;
      }
      System.out.println( sum ); 
    }
  }
}