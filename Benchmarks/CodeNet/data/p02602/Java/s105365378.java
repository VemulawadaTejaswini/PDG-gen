import java.util.*;
 
class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int K = sc.nextInt();
    long[] A = new long[N];
	A[0] = sc.nextInt();
    
    for (int i=1; i<N; i++) {
      A[i] = sc.nextInt() * A[i-1];
    }
    
    for (int i=0; i<N-K; i++) {
      if (i == 0){
        if(A[K-1] < A[K]/A[0])
          System.out.println("Yes");
        else
          System.out.println("No");
      } else {
      if (A[K+i-1]/A[i-1] < A[i+K]/A[i])
        System.out.println("Yes");
      else
        System.out.println("No");
      }
    }
  }
}