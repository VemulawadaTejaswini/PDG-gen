import java.util.Scanner;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str_scan = scan.nextLine();
    BigInteger N = new BigInteger(str_scan);
    var ans = "No";
    BigInteger amari,sum,ten,zero,keisan,nine;
    sum = BigInteger.ZERO;
    amari = BigInteger.ZERO;
    ten = BigInteger.TEN;
    zero = BigInteger.ZERO;
    nine = new BigInteger("9");


    while( (N.compareTo(zero)) > 0){
      amari = N.remainder(ten);
      sum = sum.add(amari);
      N = N.divide(ten);
    }

    keisan = sum.remainder(nine);

    if ( (keisan.compareTo(zero)) == 0 ) {
      ans = "Yes";
    }

    System.out.println(ans);
    scan.close();
  }
}