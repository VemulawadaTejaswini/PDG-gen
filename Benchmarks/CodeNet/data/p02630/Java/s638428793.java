import java.util.*;
 
public class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int sum = 0;
    int[] A = new int[1000001];
    for (int i = 0; i < N; i++) {
      int a = sc.nextInt();
      A[a] += a;
      sum += a;
    }
    int Q = sc.nextInt();
    for (int j = 0; j < Q; j++) {
      int b = sc.nextInt();
      int c = sc.nextInt();
      sum += (long)((long)A[b]/b*(long)c - (long)A[b]);
      A[c] += (long)((long)A[b]/b*(long)c);
      A[b] = 0;
      System.out.println(sum);
    }
  }
}  