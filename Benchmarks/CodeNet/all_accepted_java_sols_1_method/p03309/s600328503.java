import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    
    while (in.hasNext()) {
      int N = in.nextInt();
      int[] A = new int[N];

      for (int i = 0; i < A.length; ++i) {
        A[i] = in.nextInt() - (i + 1);
      }

      Arrays.sort(A);
      
      int mid = A[A.length / 2];
      if ( A.length % 2 == 0) {
        mid = (mid + A[A.length / 2 - 1]) / 2;
      }

      long minSadVal = 0;
      for (int i = 0; i < A.length; ++i) {
        minSadVal += Math.abs(A[i] - mid);
      }

      System.out.println(minSadVal);
    }
  }
}