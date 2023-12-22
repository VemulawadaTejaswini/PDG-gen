import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long N = in.nextLong();
    long[] A = new long[5];
    long min = Long.MAX_VALUE;
    for (int i = 0; i < 5; i++) {
      A[i] = in.nextLong();
      min = Math.min(min, A[i]);
    }
    if (N <= min) {
      System.out.println(5);
    } else {
      int pos = -1;
      while (A[++pos] != min)
        ;
      System.out.println(N / min + (N % min == 0 ? 0 : 1) + 4);
    }
  }
}