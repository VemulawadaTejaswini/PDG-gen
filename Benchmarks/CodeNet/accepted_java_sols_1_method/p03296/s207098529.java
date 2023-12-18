import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      int[] a = new int[N];

      for (int i = 0; i < a.length; ++i) {
        a[i] = in.nextInt();
      }

      int spell = 0;
      int color = 10000;

      for (int i = 1; i < a.length; ++i){
        if (a[i] == a[i - 1]) {
          a[i] = color;
          --color;
          ++spell;
        }
      }

      System.out.println(spell);
    }
  }
}