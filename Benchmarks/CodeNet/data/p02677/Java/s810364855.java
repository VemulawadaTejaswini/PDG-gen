package main.task168;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Scanner;

public class B {
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
