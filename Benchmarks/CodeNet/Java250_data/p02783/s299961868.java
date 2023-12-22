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
    AServalVsMonster solver = new AServalVsMonster();
    solver.solve(1, in, out);
    out.close();
  }

  static class AServalVsMonster {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int h = in.nextInt();
      int a = in.nextInt();
      out.println(MathLib.divRoundUp(h, a));
    }

  }

  static class MathLib {

    public static long divRoundUp(long a, long b) {
      return (a + b - 1) / b;
    }

  }
}

