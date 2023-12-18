import java.math.*;
import java.util.*;
import java.util.function.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] H = new int[N];
    for (int i = 0; i < N; i++) H[i] = sc.nextInt();
    sc.close();

    BigInteger ans = BigInteger.ZERO;
    Arrays.sort(H);
    for (int i = H.length - 1 - K; -1 < i; i--) {
      ans = ans.add(BigInteger.valueOf(H[i]));
    }
    System.out.println(ans);
  }
}