import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] V = new int[N];
    int[] C = new int[N];
    int[] P = new int[N];
    int max =0;
    for (int i=0; i<N; i++) {
      V[i] = sc.nextInt();
    }
    for (int i=0; i<N; i++) {
      C[i] = sc.nextInt();
      P[i] = V[i] - C[i];
      if (P[i] > 0) {
        max += P[i];
      }
    }
    System.out.println(max);
  }
}