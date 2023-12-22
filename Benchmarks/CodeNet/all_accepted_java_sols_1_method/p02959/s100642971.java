import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long A[] = new long[N+1];
    long B[] = new long[N];
    long out = 0;
    for (int i=0; i<N+1; i++) {
      A[i] = sc.nextLong();
    }
    for (int i=0; i<N; i++) {
      B[i] = sc.nextLong();
    }
    for (int i=0; i<N; i++) {
      if(A[i] > B[i]){
        out += B[i];
        A[i] -= B[i];
        B[i] = 0;
      } else {
        out += A[i];
        B[i] -= A[i];
        A[i] = 0;
      }
      if(A[i+1] > B[i]){
        out += B[i];
        A[i+1] -= B[i];
        B[i] = 0;
      } else {
        out += A[i+1];
        B[i] -= A[i+1];
        A[i+1] = 0;
      }
    }
    System.out.println(out);
  }
}