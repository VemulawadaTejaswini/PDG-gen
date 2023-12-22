import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

  static String s, t;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    s = br.readLine();
    t = br.readLine();

    br.close();

    int n = s.length();
    int ans = 0;

    for (int i = 0; i < n; i++) {
      if(s.charAt(i) != t.charAt(i)){
        ans++;
      }
    }

    out.println(ans);

    out.flush();

  }
}