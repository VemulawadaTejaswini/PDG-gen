import java.math.BigInteger;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] S = scanner.nextLine().split(" ");
    scanner.close();
    BigInteger N = new BigInteger(S[0]);
    BigInteger A = new BigInteger(S[1]);
    BigInteger B = new BigInteger(S[2]);
    BigInteger step = A.add(B);
    BigInteger[] dr = N.divideAndRemainder(step);
    BigInteger remainder = dr[1].compareTo(A) >= 0 ? A : dr[1];
    BigInteger blueCount = A.multiply(dr[0]).add(remainder);
    System.out.println(blueCount.toString());
  }
}