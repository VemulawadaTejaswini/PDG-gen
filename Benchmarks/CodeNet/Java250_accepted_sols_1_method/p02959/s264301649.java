import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N+1];
    for (int i = 0; i < N+1; i++) {
      A[i] = sc.nextInt();
    }
    long ans = 0;
    for (int i = 0; i < N; i++) {
      int b = sc.nextInt();
      if (i == 0) {
        int delL = Math.min(A[0], b);
        A[0] -= delL;
        int delR = Math.min(A[1], b-delL);
        A[1] -= delR;
        ans += (delL + delR);
      } else if (i == N-1) {
        int delR = Math.min(A[N], b);
        A[N] -= delR;
        int delL = Math.min(A[N-1], b-delR);
        A[N-1] -= delL;
        ans += (delL + delR);
      } else {
        int delL = Math.min(A[i], b);
        A[i] -= delL;
        int delR = Math.min(A[i+1], b-delL);
        A[i+1] -= delR;
        ans += (delL + delR);
      }
    }
    System.out.println(ans);
  }
}