import java.math.BigInteger;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    BigInteger bi = BigInteger.valueOf(sc.nextLong());

    for (int i = 0; i < n-1; i++) {
      bi = bi.multiply(BigInteger.valueOf(sc.nextLong()));
    }

    BigInteger top = BigInteger.valueOf(10);
    top = top.pow(18);

    if (bi.compareTo(top) > 0) {
      System.out.println("-1");
    } else {
      System.out.println(bi.toString());
    }

  }

}