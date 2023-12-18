import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

  static int n, m;
  static long ans;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);
    m = Integer.parseInt(in[1]);

    br.close();

    out.println(n*m);

    out.flush();
  }
}
