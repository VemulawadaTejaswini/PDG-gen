import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

  static double a, b, h, m;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String[] in = br.readLine().split(" ");
    a = Double.parseDouble(in[0]);
    b = Double.parseDouble(in[1]);
    h = Double.parseDouble(in[2]);
    m = Double.parseDouble(in[3]);

    br.close();

    double ang = Math.PI * Math.abs(30.0 * h + 0.5 * m - 6.0 * m) / 180.0;

    out.println(Math.sqrt(a * a + b * b - 2.0 * a * b * Math.cos(ang)));

    out.flush();
  }
}
