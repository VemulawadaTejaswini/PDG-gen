import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    BigInteger x = BigInteger.valueOf(Long.parseLong(sc.next()));
    BigInteger k = BigInteger.valueOf(Long.parseLong(sc.next()));
    BigInteger d = BigInteger.valueOf(Long.parseLong(sc.next()));
    BigInteger maxMove = k.multiply(d);
    if (x.abs().compareTo(maxMove) >= 0) {
      pw.println(x.abs().add(maxMove.abs().negate()));
    } else {
      BigInteger[] goToNearest = x.divideAndRemainder(d);
      if (k.add(goToNearest[0].negate()).remainder(BigInteger.TWO).compareTo(BigInteger.ZERO)
        == 0) {
        pw.println(goToNearest[1].abs());
      } else {
        pw.println(goToNearest[1].add(d).abs().min(goToNearest[1].add(d.negate()).abs()));
      }
    }
  }
}
