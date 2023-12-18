import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int N = sc.nextInt();
    long[] A = new long[N];
    long min =1000000000;
    long total =0;
    for (int i =0; i<N; i++) {
      A[i] = sc.nextInt();
      min = Math.min(A[i],min);
      total += A[i];
    }
    System.out.println(total - min);
  }
}