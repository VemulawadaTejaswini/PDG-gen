import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int color = 0;
    int free = 0;
    boolean[] app = new boolean[8];

    for (int i = 0; i < n; i++) {

      int p = sc.nextInt();

      if (p >= 3200) {
        free++;
        continue;
      }

      for (int j = 0; j < 3200; j += 400) {
        if ((j <= p) && (p < j + 400)) {
          if (app[j / 400] == false) {
            color++;
            app[j / 400] = true;
          }
          break;
        }
      }

    }

    if (color == 0) {
      System.out.println((color + 1) + " " + (color + free));
    } else {
      System.out.println(color + " " + (color + free));
    }

  }

}