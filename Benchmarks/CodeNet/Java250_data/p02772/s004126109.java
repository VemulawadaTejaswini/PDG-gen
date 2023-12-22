import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {

  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    Scanner in = new Scanner(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    BPapersPlease solver = new BPapersPlease();
    solver.solve(1, in, out);
    out.close();
  }

  static class BPapersPlease {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      boolean f = true;
      int n = in.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = in.nextInt();
        if (a[i] % 2 == 0) {
          f = f && (a[i] % 3 == 0 || a[i] % 5 == 0);
        }
      }

      out.println(f ? "APPROVED" : "DENIED");
    }

  }
}

