import java.util.*;
 
public class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    long K = sc.nextLong();
    long[] A = new long [N];
    long[] B = new long [M];
    for (int i = 0; i < N; i++) {
      long a = sc.nextLong();
      A[i] = a;
    }
    for (int i = 0; i < M; i++) {
      long b = sc.nextLong();
      B[i] = b;
    }
    //累積和A
    for (int i = 1; i < N; i++) 
      A[i] = A[i-1]+A[i];
    //累積和B
    for (int i = 1; i < M; i++) 
      B[i] = B[i-1]+B[i];
    
    long ans = 0;

    if (A[N-1] <= K) 
      ans = N;
    if (B[M-1] <= K)
      ans = Math.max(ans,M);

    int j = M-1;

    for (int i = 0; i < N; i++) {
      long minuites = K - A[i];
      if (minuites < 0)
        break;
      if (j == -1)
        j = 0;
      while (B[j] > minuites) {
        j -= 1;
        if (j == -1) {
          break;
        }
      }
      ans = Math.max(ans,i+j+2);
    }
    System.out.println(ans);
  }
} 