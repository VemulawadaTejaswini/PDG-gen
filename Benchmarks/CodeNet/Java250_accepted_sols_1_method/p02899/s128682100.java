import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A[] = new int[N];
    int B[] = new int[N];
    
    for(int i=0; i<N; i++) {
      A[i] = sc.nextInt();
    }
    
    for(int j=0; j<N; j++) {
      B[A[j]-1] = j + 1;
    }
    for(int k=0; k<N; k++) {
      System.out.print(B[k]);
      if(k != N - 1){
        System.out.print(" ");
      }
    }
  }
}