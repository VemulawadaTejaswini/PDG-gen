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
      Boolean b = true;
      for(int k=0; k<N; k++) {
        if(A[j] % A[k] == 0 && j!=k) {
          b=false;
        } 
      }
      if(b) {
        count++;
      }
    }
    System.out.println(count);
  }
}
