import java.util.*;

public class Main {
  public static void main(String... args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();

    int[] A = new int[N+1];
    for(int i=1; i<=N; i++) {
      A[scan.nextInt()] = i;
    }
    
    for(int i=1; i<=N; i++) {
      System.out.print(A[i]+" ");
    }
  }
}
