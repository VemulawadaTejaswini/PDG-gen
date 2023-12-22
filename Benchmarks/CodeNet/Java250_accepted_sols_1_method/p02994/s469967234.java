import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(), L = sc.nextInt();
    int[] A = new int[N];
    A[0] = L;
    for (int i = 1; i < N; i++) A[i] = A[i - 1] + 1;
    int ans = 0, min = 10000, ans2 = 0;
    for (int i = 0; i < N; i++) {
      ans += A[i];
      if (min > Math.abs(A[i])) {
        min = Math.abs(A[i]);
        ans2 = A[i];
      }
    }
    System.out.println(ans - ans2);
  }
}