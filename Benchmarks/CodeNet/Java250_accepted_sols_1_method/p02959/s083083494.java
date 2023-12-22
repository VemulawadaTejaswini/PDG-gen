import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    long[] A = new long[N + 1];
    long[] B = new long[N];
    for (int i = 0; i < N + 1; i++) {
      A[i] = in.nextLong();
    }
    for (int i = 0; i < N; i++) {
      B[i] = in.nextLong();
    }
    long ans = 0;
    for (int i = 0; i < N; i++) {
      ans += Math.min(A[i], B[i]);
      B[i] -= Math.min(A[i], B[i]);
      ans += Math.min(A[i + 1], B[i]);
      A[i + 1] -= Math.min(A[i + 1], B[i]);
    }
    System.out.println(ans);
  }
}