import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long[] A = new long[N];
    int sum = 0;
    for (i = 0; i < N; i++) {
      A[i] = sc.nextLong();
      if (i == 0) {
        sum = A[i];
      } else {
        sum = sum * A[i];
      }
    }
    if (sum <= 1000000000000000000L) {
      System.out.println(sum);
    } else {
      System.out.println("-1");
    }
  }
}
