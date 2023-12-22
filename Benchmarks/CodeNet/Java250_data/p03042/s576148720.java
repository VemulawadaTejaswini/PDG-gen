import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {

    new Main().run();
  }
  public void run() {

    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
      String S = in.readLine();

      int f = Integer.parseInt(S.substring(0, 2));
      int s = Integer.parseInt(S.substring(2, 4));

      String ans;
      if(isMonth(f) && isMonth(s)) ans = "AMBIGUOUS";
      else if (isMonth(f) && !isMonth(s)) ans = "MMYY";
      else if (!isMonth(f) && isMonth(s)) ans = "YYMM";
      else ans = "NA";

      System.out.println(ans);
    }
    catch(IOException e) {

      System.err.println(e);
    }
  }

  public boolean isMonth(int m) {
    return 1 <= m && m <= 12;
  }
}