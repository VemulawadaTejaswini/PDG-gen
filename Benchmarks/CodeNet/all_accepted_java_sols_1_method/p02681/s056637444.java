import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

  static String s, t;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    //String[] in = br.readLine().split(" ");
    s = br.readLine();
    t = br.readLine();

    /*
    =====templates=====
    ===inputs===
    static int n;
    in = br.readLine().split(" ");
    int[] a = Stream.of(in).mapToInt(Integer::parseInt).toArray();

    int n = Integer.parseInt(in[0]);
    long n = Long.parseLong(in[0]);
    int[] a = Stream.of(in).mapToInt(Integer::parseInt).toArray();

    ===outputs===
    PrintWriter out = new PrintWriter(System.out);
    out.println(ans);
    out.flush();
    */

    br.close();

    boolean flag = true;
    int n = s.length();
    int m = t.length();

    flag = s.equals(t.substring(0, n));

    out.println(flag ? "Yes" : "No");

    out.flush();

  }
}