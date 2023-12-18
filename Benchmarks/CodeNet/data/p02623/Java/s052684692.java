import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    long K = sc.nextLong();

    long[] A = new long[N+1];
    long[] B = new long[M+1];
    for(int i = 0; i < N; i++) {
      A[i] = sc.nextLong();
    }
    for(int i = 0; i < M; i++) {
      B[i] = sc.nextLong();
    }
    A[N] = 10000000001L;
    B[M] = 10000000001L;

    int count = 0;
    int n = 0;
    int m = 0;
    for(int i = 0; i < N + M + 1; i++) {
      if(A[n] < B[m]) {
        count++;
        K -= A[n];
        n++;
      }else{
        K -= B[m];
        m++;
        count++;
      }
      if(K < 0) {
        count--;
        break;
      }
    }

    System.out.println(count);
  }
}