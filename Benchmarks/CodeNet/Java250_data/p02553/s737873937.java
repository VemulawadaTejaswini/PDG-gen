
import java.util.*;
import java.io.*;

/**
 * Made by egor https://github.com/chermehdi/egor.
 * 
 * @author Azuz
 * 
 */
public class Main {

    void solve(Scanner in, PrintWriter out) {
      long[] a = new long[2];
      long[] b = new long[2];


      a[0] = in.nextInt();
      a[1] = in.nextInt();
      b[0] = in.nextInt();
      b[1] = in.nextInt();

      long ans = Long.MIN_VALUE;
      for (int i = 0; i < 2; ++i) {
        for (int j = 0; j < 2; ++j) {
          ans = Math.max(ans, a[i] * b[j]);

        }
      }

      out.println(ans);
    }

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
        }
    }
}
