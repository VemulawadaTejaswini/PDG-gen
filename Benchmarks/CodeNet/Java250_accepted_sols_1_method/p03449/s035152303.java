import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[][] A = new int[2][N];
    for (int i = 0; i < N; i++) {
      A[0][i] = sc.nextInt();
    }
    for (int i = 0; i < N; i++) {
      A[1][i] = sc.nextInt();
    }
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < N; i++) {
      int tmp = 0;
      for (int j = 0; j <= i; j++) {
        tmp += A[0][j];
      }
      tmp += A[1][i];
      for (int j = i + 1; j < N; j++) {
        tmp += A[1][j];
      }
      if (tmp > max) {
        max = tmp;
      }
    }
    System.out.println(max);
  }
}