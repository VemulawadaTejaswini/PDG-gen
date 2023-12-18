import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int X[] = new int[M];
    for(int a=0; a<M; a++) {
      X[a] = 0;
    }
    int K;
    int count =0;
    
    for(int i=0; i<N; i++) {
      K = sc.nextInt();
      int A;
      for(int j=0; j<K; j++) {
        A = sc.nextInt();
        X[A-1]++;
      }
    }
    for(int k=0; k<M; k++) {
      if(X[k] == N) {
        count++;
      }
    }
    System.out.println(count);
  }
}