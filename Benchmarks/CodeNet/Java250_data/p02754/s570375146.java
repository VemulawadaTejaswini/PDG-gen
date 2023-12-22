import java.util.Scanner;
import java.math.BigInteger;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BigInteger n = sc.nextBigInteger(); 
    BigInteger b = sc.nextBigInteger(); 
    BigInteger r = sc.nextBigInteger();
    sc.close();
    if(b.equals(new BigInteger("0"))) {
      System.out.println("0");
    } else {
      BigInteger lp = b.add(r);
      BigInteger nDiv = n.divide(lp);
      BigInteger rem = n.mod(lp);
      BigInteger remMinRed = rem.subtract(r);
      BigInteger lpTimesBlue = nDiv.multiply(b);
      if(rem.compareTo(b) == 0) {
        System.out.println(lpTimesBlue);
      } else if(rem.compareTo(b) == 1) {
        System.out.println(lpTimesBlue.add(b));
      } else {
        System.out.println(lpTimesBlue.add(rem));
      }
    }
  }
}
