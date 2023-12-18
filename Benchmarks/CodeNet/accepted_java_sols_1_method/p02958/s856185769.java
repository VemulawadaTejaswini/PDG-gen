import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int[] A = new int[N];
    int[] B = new int[N];
    for (int i = 0; i < N; i++) {
      B[i] = A[i] = in.nextInt();
    }
    Arrays.sort(B);
    int cnt = 0;
    for (int i = 0; i < N; i++) {
      if (A[i] != B[i]) {
        cnt++;
      }
    }
    if (cnt == 0 || cnt == 2) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
