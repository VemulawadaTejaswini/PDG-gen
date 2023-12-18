import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      int T = in.nextInt();
      int minCost = Integer.MAX_VALUE;

      while (N-- > 0) {
        int c = in.nextInt();
        int t = in.nextInt();

        if (t <= T) {
          minCost = Math.min(minCost, c);
        }
      }

      if (minCost == Integer.MAX_VALUE) {
        System.out.println("TLE");
      } else {
        System.out.println(minCost);
      }
    }
  }
}