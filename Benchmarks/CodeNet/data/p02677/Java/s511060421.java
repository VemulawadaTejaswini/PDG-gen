import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    Scanner in = new Scanner(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    B solver = new B();
    solver.solve(1, in, out);
    out.close();
  }

  static class B {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int A = in.nextInt();
      int B = in.nextInt();
      int H = in.nextInt();
      int M = in.nextInt();

      double red = Math.PI * 2 * (H / 12.0 + (M / 60) / 12.0 - (M / 60));

      double rsq = (A * A + B * B) - (2 * A * B) * Math.cos(red);

      System.out.println(Math.sqrt(rsq));
    }

  }
}

