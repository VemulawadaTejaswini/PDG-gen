import java.util.*;
 
class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int K = sc.nextInt();
    long[] A = new long[N];
    long[] KA = new long[N-K+1];
	A[0] = sc.nextInt();
    
    for (int i=1; i<N; i++) {
      A[i] = sc.nextInt() * A[i-1];
      if (i == K-1)
        KA[0] = A[i];
      if (i >= K){
      	KA[i-K+1] = A[i] / A[i-K];
      }
    }
    
    for (int i=0; i<N-K; i++) {
	  if (KA[i] < KA[i+1])
        System.out.println("Yes");
      else
        System.out.println("No");
    }
  }
}