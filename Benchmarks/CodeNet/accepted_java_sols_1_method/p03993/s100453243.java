import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(), total=0;
    int A[] = new int[N+1];
    A[0] = 0;
    for(int i=1; i<=N; i++) {
      A[i] = sc.nextInt();
    }
    for(int j=1; j<=N; j++) {
      int a1 = A[j], a2 = A[a1];
      if(j == a2) {
        total++;
      }
    }

    System.out.println(total/2);
  }
}