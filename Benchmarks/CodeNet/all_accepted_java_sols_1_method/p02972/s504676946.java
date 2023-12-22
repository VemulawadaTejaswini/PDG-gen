import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A[] = new int[N];
    int B[] = new int[N];
    int M = 0;

    for (int i=0; i<=N-1; i++) {
      A[i] = sc.nextInt();
    }
    for (int i=N; i>=1; i--) {
      int sum = 0;
      for (int k=1; k<=N/i; k++) {
        sum += B[i*k - 1];
      }
      if(sum%2 != A[i - 1]){
        B[i - 1] = 1;
        M++;
      }
    }

    System.out.println(M);
    for (int i=1; i<=N; i++) {
      if(B[i - 1] == 1){
        System.out.print(i+" ");
      }
    }
    System.out.println("");
  }
}