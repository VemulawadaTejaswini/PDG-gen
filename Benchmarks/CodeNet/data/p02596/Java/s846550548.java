import java.util.Scanner;
import java.math.BigInteger;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //input
    String newString = sc.next();
    BigInteger k = new BigInteger(newString);

    //output
    BigInteger num = new BigInteger("7");
    for(int i = 1; i < 10000; i++){
      if( num.remainder(k).equals(new BigInteger("0")) ){ //if divisible
        System.out.println(i);
        //System.out.println(num);
        System.exit(0);
      }

      //add 7 to end
      num = num.multiply(new BigInteger("10"));
      num = num.add(new BigInteger("7"));
      //System.out.println(num);
    }

    System.out.println("-1");

  }
}
