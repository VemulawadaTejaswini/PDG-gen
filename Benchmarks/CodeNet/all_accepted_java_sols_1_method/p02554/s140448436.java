import java.math.BigInteger;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    BigInteger MOD = BigInteger.TEN.pow(9);
    for (int i = 0; i < 7; i++) {
      MOD = MOD.add(BigInteger.ONE);
    }

    BigInteger ten = BigInteger.TEN;
    BigInteger nine = ten.add(BigInteger.ONE.negate());
    BigInteger eight = nine.add(BigInteger.ONE.negate());

    ten = ten.pow(n);
    nine = nine.pow(n);
    eight = eight.pow(n);

    System.out.println(ten.add(eight).add(nine.multiply(BigInteger.TWO).negate()).mod(MOD));

  }
}