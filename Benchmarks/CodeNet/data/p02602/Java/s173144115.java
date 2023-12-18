import java.util.*;

class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] A = new int[N];
    int[] KA = new int[N-K+1];
    for (int i=0; i<=N-K; i++) {
      KA[i] = 0;
    }
    
    for (int i=0; i<N; i++) {
      A[i] = sc.nextInt();
      if (i == K-1) {
        for (int j=i-K-1; j<=i; j++) {
          KA[i-K-1] += A[j];
        }
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
      
     