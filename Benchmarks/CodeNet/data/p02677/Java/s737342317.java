import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
*/public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		Scanner in = new Scanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		B solver = new B();
		solver.solve(1, in, out);
		out.close();
	}
static class B   {
public void solve(int testNumber, Scanner in, PrintWriter out) {
      int A = in.nextInt();
      int B = in.nextInt();
      int H = in.nextInt();
      int M = in.nextInt();

      int parent = H * 30;
      int child = M * 6;

      int angle = parent - child;

      if(0 > angle) angle = -(angle);

      if(angle > 270) {
        angle -= 270;
      }else if (angle > 180) {
        angle -= 180;
      }else if (angle >= 90) {
        angle -= 90;
      }

      BigDecimal cm = new BigDecimal((A*A)+(B*B)).divide(new BigDecimal(angle), 20, BigDecimal.ROUND_UP)
              .divide(new BigDecimal(5), 20, BigDecimal.ROUND_UP);

      out.print(cm.multiply(new BigDecimal(angle)));
    }

}
}

