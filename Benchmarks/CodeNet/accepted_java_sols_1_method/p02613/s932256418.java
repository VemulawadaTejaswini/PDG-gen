import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

  static int n;
  static int[] ans;
  static String res;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);
    ans = new int[4];

    for (int i = 0; i < n; i++) {
      res = br.readLine();
      if(res.equals("AC")){
        ans[0]++;
      }
      if(res.equals("WA")){
        ans[1]++;
      }
      if(res.equals("TLE")){
        ans[2]++;
      }
      if(res.equals("RE")){
        ans[3]++;
      }
    }

    br.close();

    out.println("AC x " + ans[0]);
    out.println("WA x " + ans[1]);
    out.println("TLE x " + ans[2]);
    out.println("RE x " + ans[3]);

    out.flush();

  }
}