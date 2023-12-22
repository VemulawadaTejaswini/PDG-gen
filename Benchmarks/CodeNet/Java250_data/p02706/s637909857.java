import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] A = new int[M];
    int total =0;
    for (int i =0; i<M; i++) {
      A[i] = sc.nextInt();
      total += A[i];
    }
    if (N - total >= 0) {
      System.out.println(N - total);
    } else {
      System.out.println(-1);
    }
  }
}