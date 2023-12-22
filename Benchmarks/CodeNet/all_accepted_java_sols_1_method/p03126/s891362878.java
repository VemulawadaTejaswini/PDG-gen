import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    
    while (in.hasNext()) {
      int N = in.nextInt();
      int M = in.nextInt();
      int[] A = new int[M];

      for (int i = 0; i < N; ++i) {
        int K = in.nextInt();

        for (int j = 0; j < K; ++j) {
          ++A[in.nextInt() - 1];
        }
      }
      
      int count = 0;
      for (int i = 0; i < A.length; ++i) {
        if (A[i] == N) {
          ++count;
        }
      }

      System.out.println(count);
    }
  }
}