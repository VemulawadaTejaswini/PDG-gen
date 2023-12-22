import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      int[] a = new int[N + 1];

      for (int i = 1; i < a.length; ++i) {
        a[i] = in.nextInt();
      }

      int[] ballNum = new int[N + 1];
      for (int i = a.length - 1; i >= 1; --i) {
        int sumOfMultiple = 0;

        for (int j = i; j < ballNum.length; j +=i) {
          sumOfMultiple += ballNum[j];
        }

        if (sumOfMultiple % 2 != a[i]) {
          ballNum[i] = 1;
        }
      }

      ArrayList<Integer> out = new ArrayList<Integer> ();
      for (int i = 0; i < ballNum.length; ++i) {
        if (ballNum[i] > 0) {
          out.add(i);
        }
      }

      System.out.println(out.size());
      if (out.size() > 0) {
        System.out.print(out.get(0));
        for (int i = 1; i < out.size(); ++i) {
          System.out.printf(" %d", out.get(i));
        }
        System.out.println();
      }
    }
  }
}