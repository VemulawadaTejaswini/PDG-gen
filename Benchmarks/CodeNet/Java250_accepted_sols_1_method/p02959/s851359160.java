import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      int[] A = new int[N + 1];
      int[] B = new int[N];
      long killed = 0;

      for (int i = 0; i < A.length; ++i) {
        A[i] = in.nextInt();
      }

      for (int i = 0; i < B.length; ++i) {
        B[i] = in.nextInt();
      }

      for (int i = 0; i < B.length; ++i) {
        int areaSum = A[i] + A[i + 1];

        killed += Math.min(B[i], areaSum);
        
        B[i] = Math.max(B[i] - A[i], 0);
        A[i + 1] = Math.max(A[i + 1] - B[i], 0);
      }

      System.out.println(killed);
    }
  }
}