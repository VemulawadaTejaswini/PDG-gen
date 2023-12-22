import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A[] = new int[N];
    int B[] = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    for (int i = 0; i < N; i++) {
      B[i] = sc.nextInt();
    }
    int ans = 0;
    for (int i = 0; i < N; i++) {
      int cost = A[0];
      if (i != 0) {
        for (int k = 1; k <= i; k++)
          cost += A[k];
      }
      for (int j = i; j < N; j++) {
        cost += B[j];
      }
      ans = Math.max(cost, ans);
    }
    System.out.println(ans);
  }
}