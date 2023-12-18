import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

  static int l, r, d;
  static long ans;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String[] in = br.readLine().split(" ");
    l = Integer.parseInt(in[0]);
    r = Integer.parseInt(in[1]);
    d = Integer.parseInt(in[2]);


    br.close();

    for (int i = l; i <= r; i++) {
      if (i % d == 0) ans++;
    }

    out.println(ans);

    out.flush();
  }
}