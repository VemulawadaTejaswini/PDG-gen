import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int N = Integer.parseInt(sc.next());
    int K = Integer.parseInt(sc.next());
    int[] A = new int[N];
    
    for (int i=0; i<N; i++){
      A[i] = Integer.parseInt(sc.next());
      if (i >= K){
        if (A[i] > A[i-K])
          System.out.println("Yes");
        else
          System.out.println("No");
      }
    }
  }
}