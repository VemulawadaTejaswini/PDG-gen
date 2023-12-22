import java.util.*;
 
public class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long sum = 0;
    int[] A = new int[1000001];
    for (int i = 0; i < N; i++) {
      int a = sc.nextInt();
      A[a]++;
      sum += a;
    }
    int Q = sc.nextInt();
    for (int j = 0; j < Q; j++) {
      int b = sc.nextInt();
      int c = sc.nextInt();
      sum += (long)(c-b)*A[b];
      A[c] += A[b];
      A[b] = 0;
      System.out.println(sum);
    }
  }
}