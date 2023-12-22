import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      long N = in.nextLong();
      long maxGroup = 0;

      for (int i = 0; i < 5; ++i) {
        long transport = in.nextLong();
        long group = N / transport + (N % transport > 0 ? 1 : 0);

        maxGroup = Math.max(maxGroup, group);
      }

      System.out.println(maxGroup + 5 - 1);
    }
  }
}