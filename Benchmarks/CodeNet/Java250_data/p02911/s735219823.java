import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      int K = in.nextInt();
      int Q = in.nextInt();
      int[] point = new int[N];
 
      for (int i = 0; i < Q; ++i) {
        ++point[in.nextInt() - 1];       
      }

      for (int i = 0; i < point.length; ++i) {
        if (point[i] + K - Q > 0) {
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
      }
    }
  }
}