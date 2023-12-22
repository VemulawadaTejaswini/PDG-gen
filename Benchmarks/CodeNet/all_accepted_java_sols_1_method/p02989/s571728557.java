import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A[] = new int[N];
    for (int i=0; i<N; i++) {
      A[i] = sc.nextInt();
    }
    Arrays.sort(A);
    if(A[N/2-1] == A[N/2]){
      System.out.println(0);
    } else {
      System.out.println(A[N/2] - A[N/2-1]);
    }
  }
}