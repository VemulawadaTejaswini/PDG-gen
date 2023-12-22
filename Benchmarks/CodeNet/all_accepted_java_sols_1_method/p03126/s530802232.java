import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] K = new int[N];
    int[][] A = new int[N][M];
    int[] count = new int[M];
    int ans =0;
    for (int i=0; i<N; i++) {
      K[i] = sc.nextInt();
      for (int j=0; j<K[i]; j++) {
        A[i][j] = sc.nextInt();
      }
    }
    for (int i=1; i<=M; i++) {
      for (int j=0; j<N; j++) {
        for (int k=0; k<K[j]; k++) {
          if(A[j][k] == i) {
            count[i-1]++;
          }
        }
      }
    }
    for (int i=1; i<=M; i++) {
      if (count[i-1] == N) ans++;
    }
    System.out.println(ans);
  }
}