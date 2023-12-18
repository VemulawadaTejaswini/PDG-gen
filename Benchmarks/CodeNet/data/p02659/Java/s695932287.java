import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {
    solve(System.in, System.out);
  }

  static void solve(InputStream is, PrintStream os) {
    // Your code here!
    Scanner scan = new Scanner(is);
    long A = scan.nextLong();
    Double B = scan.nextDouble();
    BigDecimal BB = new BigDecimal(B.toString());
    BigDecimal BD = BB.multiply(new BigDecimal(A));

    os.println(BD.longValue());
  }
}
