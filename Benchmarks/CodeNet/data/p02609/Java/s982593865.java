import java.math.BigInteger;
import java.util.*;

public class Main {

  private static void solve(int N, BigInteger X) {
    for (int i = N - 1; i >= 0; i--) {
      BigInteger Xi = X.flipBit(i);
      System.out.println(getNumberOfSteps(Xi));
    }
  }

  private static int getNumberOfSteps(BigInteger i) {
    int steps = 0;
    while (i.compareTo(BigInteger.ZERO) != 0) {
      int bitCnt = i.bitCount();
      i = i.mod(BigInteger.valueOf(bitCnt));
      steps++;
    }
    return steps;
  }

  public static void main(String[] args) {
    int N = scanner.nextInt();
    String X = scanner.next();
    solve(N, new BigInteger(X, 2));
  }

  private static final Scanner scanner = new Scanner(System.in);
}
