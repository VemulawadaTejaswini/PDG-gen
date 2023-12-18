import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[][] A = new int[2+1][N+1];
    for (int i = 1; i <= 2; i++) {
      for (int j = 1; j <= N; j++) {
        int a = sc.nextInt();
        A[i][j] = a + Math.max(A[i-1][j], A[i][j-1]);
      }
    }
    
    System.out.println(A[2][N]);
  }
}