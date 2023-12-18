import java.math.BigInteger;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BigInteger bigN = new BigInteger(sc.next());
    StringBuilder ret = new StringBuilder();
    do {
      int b = Integer.parseInt(bigN.divideAndRemainder(new BigInteger("26"))[1].toString());
      int add;
      if (b == 0) {
        add = 26;
      } else {
        add = b;
      }

      String c = Character.toString(96 + add);
      ret.insert(0, c);

      if (bigN.compareTo(new BigInteger("26")) <= 0) {
        break;
      }
      bigN = bigN.divide(new BigInteger("26"));
    } while (bigN.compareTo(new BigInteger("0")) != 0);

    System.out.println(ret.toString());
  }
}
