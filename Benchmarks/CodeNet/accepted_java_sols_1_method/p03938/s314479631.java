import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int N = sc.nextInt();
    int[] P = new int[N];
    for (int i = 0; i < N; i++) {
      P[i] = sc.nextInt() - 1;
    }
    int[] A = new int[N];
    int[] B = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = 30000 * (i + 1);
      B[i] = 30000 * (N - i);
    }
    for (int i = 0; i < N; i++) {
      B[P[i]] -= (N - i);
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      if (i != 0) sb.append(" ");
      sb.append(A[i]);
    }
    sb.append("\n");
    for (int i = 0; i < N; i++) {
      if (i != 0) sb.append(" ");
      sb.append(B[i]);
    }
    System.out.println(sb);
  }
}
