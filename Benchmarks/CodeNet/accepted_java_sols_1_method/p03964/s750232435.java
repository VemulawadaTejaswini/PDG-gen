import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] T = new int[N];
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      T[i] = sc.nextInt();
      A[i] = sc.nextInt();
    }
    long t = 1;
    long a = 1;
    for (int i = 0; i < N; i++) {
      long n = Math.max((t + T[i] - 1) / T[i], (a + A[i] - 1) / A[i]);
      t = n * T[i];
      a = n * A[i];
    }
    System.out.println(t + a);
  }
}