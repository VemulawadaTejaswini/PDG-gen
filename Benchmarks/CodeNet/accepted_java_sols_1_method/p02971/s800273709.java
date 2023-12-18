import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int[] A = new int[N];
    int[] B = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = B[i] = in.nextInt();
    }
    Arrays.sort(B);
    if (B[N - 1] == B[N - 2]) {
      for (int i = 0; i < N; i++) {
        System.out.println(B[N - 1]);
      }
    } else {
      for (int i = 0; i < N; i++) {
        System.out.println(A[i] == B[N - 1] ? B[N - 2] : B[N - 1]);
      }
    }
  }
}