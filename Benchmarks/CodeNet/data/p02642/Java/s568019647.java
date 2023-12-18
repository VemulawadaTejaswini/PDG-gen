import java.util.*;

public class Main{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt(), count=0;
    int A[] = new int[N];
    for(int i=0; i<N; i++) {
      A[i] = sc.nextInt();
	}
    for(int j=0; j<N; j++) {
      int b = 1;
      for(int k=0; k<N; k++) {
        if(A[j] % A[k] == 0 && j!=k) {
          b=0;
          break;
        } 
      }
      count += b;
    }
    System.out.println(count);
  }
}
