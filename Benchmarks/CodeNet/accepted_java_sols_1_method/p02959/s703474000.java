import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next()); 
    long[] A = new long[N+1];  
    long[] B = new long[N];  
    for (int i=0; i < N+1 ;i++) {
      A[i] = Integer.parseInt(sc.next()); 
    }
    for (int i=0; i < N ;i++) {
      B[i] = Integer.parseInt(sc.next()); 
      }
    long count = 0;
    for(int i=0;i<N;i++ ){
      if(B[i]>=A[i]){
        count += A[i];
        long tmp = B[i] - A[i];
        A[i] = 0;
        if(tmp>=A[i+1]){
          count += A[i+1];
          A[i+1] = 0;
        }else{
          count += tmp;
          A[i+1] -= tmp;
        }
      }else{
        A[i] -= B[i]; 
        count += B[i];

      }
    }
    System.out.println(count);
  }
  
}

