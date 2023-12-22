import java.util.*;
import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {
    int N;
    int[] A;
    try(Scanner sc = new Scanner(System.in)) {
      N = sc.nextInt();
      A = new int[N];
      for(int i = 0; i < N; i++) {
        A[i] = sc.nextInt();
      }
    }
    double answer = solve(A);
    System.out.println(answer);
  }
  
  private static double solve(int[] a) {
    int n = a.length;
    if ( n == 0 ) {
      throw new IllegalStateException("n must be positive");
    }
    if ( n == 1 ) {
      return (double)a[0];
    }
    int n0 = (int)Math.ceil(n/2);
    int n1 = n - n0;
    double r = 0.0d;
    if ( n0 > 0 ) {
      int[] a0 = new int[n0];
      System.arraycopy(a, 0, a0, 0, n0);
      double s0 = solve(a0);
      r += 1/s0;
    }
    if ( n1 > 0 ) {
	  int[] a1 = new int[n1];
      System.arraycopy(a, n0, a1, 0, n1);
      double s1 = solve(a1);
      r += 1/s1;
    }
    return 1/r;
  }

}