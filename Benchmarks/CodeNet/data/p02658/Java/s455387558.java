import java.util.*;

public class Main {
  public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    long A[] = new long[N];
    long B = 1;
    Boolean bool = true;
    long C = (long)1000000000 * (long)1000000000;
    
    for(int i=0; i<N; i++) {
      A[i] = sc.nextLong();
    }
    Arrays.sort(A);
    
    for(int j=0; j<N; j++) {
      B *= A[j];
      if(B>C || B<0) {
        bool = false;
      }
    }
    if(!bool) {
      System.out.println(-1);
    } else {
      System.out.println(B);
    }
  }
}