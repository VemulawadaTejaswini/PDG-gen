import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int K = sc.nextInt();

    int[] A = new int[N+1];
    int[] B = new int[M+1];
    for(int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    for(int i = 0; i < M; i++) {
      B[i] = sc.nextInt();
    }
    A[N] = 1000000001;
    B[M] = 1000000001;

    int count = 0;
    int n = 0;
    int m = 0;
    for(int i = 0; i < N + M + 1; i++) {
      if(K < 0) {
        count--;
        break;
      }
      if(A[n] < B[m]) {
        count++;
        K -= A[n];
        n++;
      }else{
        K -= B[m];
        m++;
        count++;
      }
    // System.out.println();
    // System.out.println(K);
    // System.out.println(count);
    }
    if(count == N + M + 1) count--;

    System.out.println(count);
  }
}