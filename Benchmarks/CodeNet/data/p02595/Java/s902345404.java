import java.math.BigInteger;
import java.util.*;

public class Main {

  private static void solve(int[][] points, int d) {
    int cnt = 0;
    for (int[] p : points) {
      if (dist(p[0], p[1]) <= d) {
        cnt++;
      }
    }
    System.out.println(cnt);
  }

  private static long dist(long x, long y) {
    BigInteger i = BigInteger.valueOf(x);
    BigInteger j = BigInteger.valueOf(y);
    return i.multiply(i).add(j.multiply(j)).sqrt().longValueExact();
  }

  public static void main(String[] args) {
    int n = scanner.nextInt();
    int d = scanner.nextInt();
    int[][] points = new int[n][2];
    for (int j = 0; j < n; j++) {
      points[j][0] = scanner.nextInt();
      points[j][1] = scanner.nextInt();
    }
    solve(points, d);
  }

  private static final Scanner scanner = new Scanner(System.in);
}
