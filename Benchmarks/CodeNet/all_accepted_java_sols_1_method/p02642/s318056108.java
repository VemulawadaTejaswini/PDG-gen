import java.util.Scanner;
import java.util.Arrays;

public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i =0; i<N; i++) {
      A[i] = sc.nextInt();
    }
    Arrays.sort(A);
    boolean[] dp = new boolean[1000001];
    int count =0;
    for (int i =0; i<N; i++) {
      dp[A[i]] = true;
    }
    for (int i =0; i<N; i++) {
      if (i >0 && A[i] == A[i-1]) continue;
      int j = A[i] * 2;
      while (j < 1000001) {
        dp[j] = false;
        j+= A[i];
      }
    }
    for (int i =0; i<N; i++) {
      if (i <N-1 && A[i] == A[i+1]) {
        dp[A[i]] = false;
      }
      if (dp[A[i]] == true) {
        count++;
      }
    }
    System.out.println(count);
  }
}