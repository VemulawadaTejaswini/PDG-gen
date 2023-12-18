import java.util.*;
import java.math.*;

public class Main {

  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    BigInteger total = new BigInteger("0");
    BigInteger square = new BigInteger("0");

    for (int i =0; i<N; i++) {
      long A = sc.nextLong();
      long AA = A * A;
      total = total.add(BigInteger.valueOf(A));
      square = square.add(BigInteger.valueOf(AA));
    }
    total = total.multiply(total);
    total = total.subtract(square);
    total = total.divide(BigInteger.valueOf(2));
    total = total.remainder(BigInteger.valueOf(1000000007));
    System.out.println(total);
  }
}