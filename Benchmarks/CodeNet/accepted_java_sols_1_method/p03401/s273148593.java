import java.util.Scanner;

public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N+2];
    A[0] = 0; A[N+1] = 0;
    int[] cost = new int[N+2];
    int[] cost2 = new int[N+2];
    int total =0;
    for (int i =1; i<=N; i++) {
      A[i] = sc.nextInt();
    }
    for (int i =1; i<=N+1; i++) {
      cost[i] = Math.abs(A[i] - A[i-1]);
      total += cost[i];
      if (i>=2) {
        cost2[i] = Math.abs(A[i] - A[i-2]);
      }
    }
    for (int i =2; i<=N+1; i++) {
      System.out.println(total - cost[i] - cost[i-1] + cost2[i]);
    }
  }
}    