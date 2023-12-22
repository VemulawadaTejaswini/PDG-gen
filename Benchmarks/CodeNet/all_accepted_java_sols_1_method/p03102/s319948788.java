import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int C = sc.nextInt();
    int[][] A = new int[N][M];
    int[] B = new int[M];
    int[] count = new int[N];
    int tmp =C,ans =0;
    for (int i=0; i<M; i++) {
      B[i] = sc.nextInt();
    }
    for (int i=0; i<N; i++) {
      for (int j=0; j<M; j++) {
        A[i][j] = sc.nextInt();
      }
    }
    for (int i=0; i<N; i++) {
      for (int j=0; j<M; j++) {
        tmp += A[i][j] * B[j];
      }
      if (tmp > 0) count[i]++;
      tmp = C;
    }
    for (int i=0; i<N; i++) {
      if (count[i] == 1) ans++;
    }
    System.out.println(ans);
  }
}