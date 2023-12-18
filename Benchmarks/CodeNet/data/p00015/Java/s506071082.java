import java.util.Scanner;
import java.util.Vector;
import java.math.BigInteger;

class Main{
  public static void main(String[] av){
    Scanner sc = new Scanner(System.in);

    String n = sc.nextLine();
    while(sc.hasNextLine()){
      String str1 = sc.nextLine();
      String str2 = sc.nextLine();
      BigInteger bi1 = new BigInteger( str1 );
      BigInteger bi2 = new BigInteger( str2 );
      System.out.println( bi1.add( bi2) ); 
    }
  }
}