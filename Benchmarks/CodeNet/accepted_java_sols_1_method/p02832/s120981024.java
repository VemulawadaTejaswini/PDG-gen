import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++)
      A[i] = sc.nextInt();
    sc.close();

    int k = 0;
    for (int i = 0; i < N; i++)
      k += A[i] == k + 1 ? 1 : 0;

    int ans = k == 0 ? -1 : N - k;
    System.out.println(ans);
  }
}