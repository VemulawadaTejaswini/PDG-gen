import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      int[] d = new int[N];

      for (int i = 0; i < d.length; ++i) {
        d[i] = in.nextInt();
      }

      int sum = 0;

      for (int i = 0; i < d.length; ++i) {
        for (int j = i + 1; j < d.length; ++j) {
          sum += d[i] * d[j];
        }
      }

      System.out.println(sum);
    }
  }
}