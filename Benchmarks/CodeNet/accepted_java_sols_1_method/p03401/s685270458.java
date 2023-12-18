import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int sum = 0;
    int[] A = new int[N+1];
    A[0] = 0;
    for (int i = 1; i <= N; i++) {
      A[i] = sc.nextInt();
      sum += Math.abs(A[i] - A[i-1]);
    }
    sum += Math.abs(A[N] - 0);

    for (int i = 1; i < N; i++) {
      int ans = sum
        - Math.abs(A[i] - A[i-1])
        - Math.abs(A[i+1] - A[i])
        + Math.abs(A[i+1] - A[i-1]);
      System.out.println(ans);
    }
    // i == N
    int ans = sum
      - Math.abs(A[N] - A[N-1])
      - Math.abs(A[N] - 0)
      + Math.abs(A[N-1] - 0);
    System.out.println(ans);
  }
}