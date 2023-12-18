import java.util.*;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      int T = sc.nextInt();
      int A = sc.nextInt();
      int[] H = new int[N];
      for ( int j = 0; j < N; j++ ) {
        H[j] = sc.nextInt();
      }
      double h = (T-A)/0.006;
      double diff = Math.abs(H[0] - h);
      int answer = 1;
      if ( N > 1 ) {
        for ( int j = 1; j < N; j++ ) {
          double tempDiff = Math.abs(H[j] - h);
          if ( tempDiff < diff ) {
            diff = tempDiff;
            answer = j + 1;
          }
        }
      }
      System.out.println(answer);
    }
  }
}