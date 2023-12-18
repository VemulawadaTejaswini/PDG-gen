import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

  static long n;
  static String ans;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String[] in = br.readLine().split(" ");
    n = Long.parseLong(in[0]);

    br.close();

    ans = "";

    while (n > 0) {
      char nc = (char) ((n - 1) % 26L + 'a');
      ans = nc + ans;
      n /= 26L;
    }

    out.println(ans);

    out.flush();
  }
}
