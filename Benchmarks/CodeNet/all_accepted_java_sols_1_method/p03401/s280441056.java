import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N + 2];
    A[0] = 0;
    A[N + 1] = 0;
    for (int i = 1; i <= N; i++) {
      A[i] = sc.nextInt();
    }
    int sum = 0;
    for (int i = 0; i <= N; i++) {
      sum += Math.abs(A[i] - A[i + 1]);
    }
    for (int i = 1; i <= N; i++) {
      int ans = sum + Math.abs(A[i - 1] - A[i + 1]) - (Math.abs(A[i - 1] - A[i]) + Math.abs(A[i] - A[i + 1]));
      System.out.println(ans);
    }
  }
}