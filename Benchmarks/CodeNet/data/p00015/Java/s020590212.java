import java.util.*;
import java.math.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out ="";
    int n = scanner.nextInt();
    for (int ii = 0; ii < n; ii++) {
      String a = scanner.next();
      String b = scanner.next();
      if (a.length() > 80 || b.length() > 80) {
        out += "overflow";
        continue;
      }
      BigInteger aa = new BigInteger(a);
      BigInteger bb = new BigInteger(b);
      BigInteger cc = aa.add(bb);
      if (cc.toString().length() > 80) {
        out += "overflow";
        continue;
      }
      out += cc + "\n";
    }
    System.out.print(out);
  }
}