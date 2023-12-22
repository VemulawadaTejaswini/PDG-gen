import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long[] T = new long[N];
    long[] A = new long[N];
    for (int i =0; i<N; i++) {
      T[i] = sc.nextInt();
      A[i] = sc.nextInt();
    }
    for (int i =0; i<N-1; i++) {  
      if (A[i+1] < A[i] || T[i+1] < T[i]) {
        long a = Math.max((A[i]+A[i+1]-1)/A[i+1],(T[i]+T[i+1]-1)/T[i+1]);
        A[i+1] *= a;
        T[i+1] *= a;
      }
    }
    System.out.println(A[N-1] + T[N-1]);
  }
}