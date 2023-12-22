import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);
    while (scan.hasNextLine()) {
      String line = scan.nextLine();
      String[] vals = line.split(" ");
      BigInteger int1 = new BigInteger(vals[0]);
      BigInteger int2 = new BigInteger(vals[1]);

      BigInteger gcd = int1.gcd(int2);

      BigInteger lcm = (int1.multiply(int2)).divide(gcd);
      System.out.println(gcd.toString() + " " + lcm.toString());

    }
  }
}