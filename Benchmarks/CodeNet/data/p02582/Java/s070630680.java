import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

  static String s;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    // String[] in = br.readLine().split(" ");
    s = br.readLine();

    br.close();

    int ans = 1;
    if (s.equals("RRR")) {
      ans = 3;
    } else if (s.substring(0, 2).equals("RR") || s.substring(1, 3).equals("RR")) {
      ans = 2;
    } else if (s.equals("SSS")) {
      ans = 0;
    }

    out.println(ans);

    out.flush();
  }
}
