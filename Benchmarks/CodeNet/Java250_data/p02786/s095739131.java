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
    DCaracalVsMonster solver = new DCaracalVsMonster();
    solver.solve(1, in, out);
    out.close();
  }

  static class DCaracalVsMonster {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      long h = in.nextLong();
      out.println(fun(h));
    }

    long fun(long h) {
      return h == 1 ? 1 : fun(h / 2) * 2 + 1;
    }

  }
}

