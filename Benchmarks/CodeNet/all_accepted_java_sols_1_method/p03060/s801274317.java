
import java.util.Scanner;


public class Main {

  public static void main(String [] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

    int[] vs = new int[n];
    int[] cs = new int[n];

    for (int i = 0; i < n; i ++) {
      vs[i] = s.nextInt();
    }

    int out = 0;

    for (int i = 0; i < n; i ++) {
      cs[i] = s.nextInt();
      if (vs[i] > cs[i])
        out += vs[i] - cs[i];
    }

    System.out.println(out);

  }

}
