import java.util.Scanner;
import java.math.BigInteger;

class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    BigInteger A = new BigInteger(scanner.next());
    float B = Float.parseFloat(scanner.next());
    scanner.close();

    BigInteger B2 = new BigInteger(String.valueOf((int)(B*100)));
    System.out.println((A.multiply(B2).divide(new BigInteger("100"))).toString());
  }
}
