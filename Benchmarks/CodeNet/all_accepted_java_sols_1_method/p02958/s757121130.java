import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      int[] p = new int[N + 1];
      int countWrongPos = 0;

      for (int i = 1; i < p.length; ++i) {
        p[i] = in.nextInt();
        if (i != p[i]) {
          ++countWrongPos;
        }
      }

      if (countWrongPos == 0 || countWrongPos == 2) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}