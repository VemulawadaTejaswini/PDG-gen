import java.util.*;
public class Main {

  public static void main (String[] args) {
	
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    
    long[] A = new long[N+1];
    long[] B = new long[N];
    
    for (int i = 0; i <= N; i++) {
      A[i] = sc.nextInt();
    }

    for (int i = 0; i < N; i++) {
      B[i] = sc.nextInt();
    }

    sc.close();

    long count = 0;

    long A_ = A[N];

    for (int i = N-1; 0 <= i; i--){

      A_ = A[i] + A_;

      if (A_ <= B[i]) {

        count = count + A_;
      
        A_ = 0;
     
      } else {
      
        count = count + B[i];
      
        if ((A_ - B[i]) < A[i]){
      
          A_ = A_ - B[i];
      
        } else {
      
          A_ = A[i];
      
        }

      }
    }

    System.out.println(count);
 
  }

}