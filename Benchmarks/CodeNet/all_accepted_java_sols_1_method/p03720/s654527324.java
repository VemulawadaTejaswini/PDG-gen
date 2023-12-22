import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(), M = sc.nextInt(),a,b;
    int A[] = new int[N];
    for(int i=0; i<M; i++) {
      a=sc.nextInt()-1;
      b=sc.nextInt()-1;
      A[a]++;
      A[b]++;
    }
    for(int j=0; j<N; j++) {
      System.out.println(A[j]);
    }
  }
}