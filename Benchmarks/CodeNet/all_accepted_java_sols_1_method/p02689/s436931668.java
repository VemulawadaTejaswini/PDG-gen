import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] H = new int[N];
    for (int i = 0; i < N; i++)
      H[i] = sc.nextInt();
    int[] A = new int[M];
    int[] B = new int[M];
    for (int i = 0; i < M; i++) {
      A[i] = sc.nextInt();
      B[i] = sc.nextInt();
    }
    sc.close();

    boolean[] h = new boolean[N];
    for (int i = 0; i < M; i++) {
      if (H[A[i] - 1] <= H[B[i] - 1])
        h[A[i] - 1] = true;
      if (H[A[i] - 1] >= H[B[i] - 1])
        h[B[i] - 1] = true;
    }

    int ans = N;
    for (int i = 0; i < N; i++)
      if (h[i]) ans--;
    System.out.println(ans);
  }
}
