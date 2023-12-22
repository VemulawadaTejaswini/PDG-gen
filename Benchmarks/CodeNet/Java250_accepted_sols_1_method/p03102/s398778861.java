import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      int M = in.nextInt();
      int C = in.nextInt();
      int[] B = new int[M];

      for (int i = 0; i < B.length; ++i) {
        B[i] = in.nextInt();
      }

      int countSol = 0;
      for (int i = 0; i < N; ++i) {
        int sum = C;
        for (int j = 0; j < M; ++j) {
          sum += B[j] * in.nextInt();
        }
        
        if (sum > 0) {
          ++countSol;
        }
      }

      System.out.println(countSol);
    }
  }
}