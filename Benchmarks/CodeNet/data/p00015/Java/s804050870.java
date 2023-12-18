import java.util.Scanner;
import java.util.Vector;
import java.math.BigInteger;

class Main{
  public static void main(String[] av) throws Exception{
    Scanner sc = new Scanner(System.in);

    String n = sc.nextLine();
    while(sc.hasNextLine()){
      String str1 = sc.nextLine();
      String str2 = sc.nextLine();
      if ( 80 < str1.length() || 80 < str2.length() ){
        System.out.println("overflow");
        continue;
      }
      BigInteger bi1 = new BigInteger( str1 );
      BigInteger bi2 = new BigInteger( str2 );
      BigInteger sum = bi1.add(bi2);
      if ( 80 < sum.toString().length() ){
        System.out.println("overflow");
        continue;
      }
      System.out.println( sum ); 
    }
  }
}