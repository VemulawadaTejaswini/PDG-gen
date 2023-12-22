import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      int[] V = new int[N];
      int[] C = new int[N];

      for (int i = 0; i < V.length; ++i) {
        V[i] = in.nextInt();
      }

      for (int i = 0; i < C.length; ++i) {
        C[i] = in.nextInt();
      }

      int maxDiff = 0;
      for (int i = 0; i < V.length; ++i) {
        int diff = V[i] - C[i];

        if (diff > 0) {
          maxDiff += diff;
        }
      }

      System.out.println(maxDiff);
    }
  }
}