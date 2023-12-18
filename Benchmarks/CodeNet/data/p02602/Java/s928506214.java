import java.util.*;
 
class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] A = new int[N];
	A[0] = sc.nextInt();
    
    for (int i=1; i<N; i++) {
      A[i] = sc.nextInt() + A[i-1];
    }
    
    for (int i=0; i<N-K; i++) {
      if (A[K+i-1]-A[i] < A[i+K]-A[i+1])
        System.out.println("Yes");
      else
        System.out.println("No");
    }
  }
}