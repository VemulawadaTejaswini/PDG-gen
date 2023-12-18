import java.util.*;
import static java.lang.System.*;
import java.math.*;
 
public class Main{
  public static void main(final String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] A = new int[9];
    for (int i=0; i < 9; i++) {
      A[i] = sc.nextInt();
    }
    int N = sc.nextInt();
    int[] b = new int[N];
    for (int i = 0; i < N; i++) {
      b[i] = sc.nextInt();
    }
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < N; j++) {
        if (A[i] == b[j]) {
          A[i] = 101;
        }
      }
    }

    if ((A[0] + A[1] + A[2]) == 303) {
      out.print("Yes");
      System.exit(0);
    }
    if ((A[3] + A[4] + A[5]) == 303) {
      out.print("Yes");
      System.exit(0);
    }
    if ((A[6] + A[7] + A[8]) == 303) {
      out.print("Yes");
      System.exit(0);
    }
    if ((A[0] + A[3] + A[6]) == 303) {
      out.print("Yes");
      System.exit(0);
    }
    if ((A[1] + A[4] + A[7]) == 303) {
      out.print("Yes");
      System.exit(0);
    }
    if ((A[2] + A[5] + A[8]) == 303) {
      out.print("Yes");
      System.exit(0);
    }
    if ((A[0] + A[4] + A[8]) == 303) {
      out.print("Yes");
      System.exit(0);
    }
    if ((A[6] + A[4] + A[2]) == 303) {
      out.print("Yes");
      System.exit(0);
    }
    out.print("No");
    
  }
  }

