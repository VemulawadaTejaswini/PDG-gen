import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] T = new int[N];
    int sum = 0;
    for (int i = 0; i < N; i++) {
      T[i] = sc.nextInt();
      sum += T[i];
    }
    int M = sc.nextInt();
    int[] P = new int[M];
    int[] X = new int[M];
    for (int i = 0; i < M; i++) {
      P[i] = sc.nextInt();
      X[i] = sc.nextInt();
    }
    for (int i = 0; i < M; i++) {
      int d = X[i] - T[P[i] - 1];
      System.out.println(sum + d);
    }
  }
}