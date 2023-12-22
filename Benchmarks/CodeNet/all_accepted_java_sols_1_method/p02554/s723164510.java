import java.util.*;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    BigInteger moder = new BigInteger("1000000007");
    BigInteger all = BigInteger.TEN;
    all = all.pow(n);
    BigInteger toNine = new BigInteger("9");
    toNine = toNine.pow(n);
    BigInteger toEight = new BigInteger("8");
    toEight = toEight.pow(n);
    BigInteger ans = new BigInteger("0");
    ans = ans.add(all);
    ans = ans.subtract(toNine);
    ans = ans.subtract(toNine);
    ans = ans.add(toEight);
    ans = ans.mod(moder);
    System.out.println(ans);

  }
}
