import java.util.*;
import java.math.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    BigInteger ans = new BigInteger("1");
    BigInteger zero = BigInteger.ZERO;
    BigInteger ten = BigInteger.ONE;
    BigInteger max = new BigInteger("1000000000000000000");
    int flag = 0;
    for (int i = 0; i < n; i++) {
      BigInteger a = new BigInteger(sc.next());
      if (a.compareTo(zero) == 0) {
        flag = 2;
        break;
      }
      ans = ans.multiply(a);
      if (ans.compareTo(max) == 1) {
        flag = 1;
      }
    }

    if (flag == 1) {
      System.out.println(-1);
    } else if (flag == 2) {
      System.out.println(0);
    } else {
      System.out.println(ans);
    }

  }
}
