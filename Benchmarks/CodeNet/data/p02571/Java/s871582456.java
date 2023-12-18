import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ans = 30000;
    String s = sc.next();
    String t = sc.next();
    char[] tc = t.toCharArray();

    for (int cnt = 0; cnt < (int) Math.pow(2, t.length()); cnt++) {
      String tcs = "";
      int tmpCnt = cnt;
      int ansCnt = 0;
      for (int j = 0; j < t.length(); j++) {

        if (tmpCnt % 2 == 0) {
          tcs += tc[j];

        } else {
          tcs += ".";
          ansCnt++;
        }
        tmpCnt /= 2;
      }
      // System.out.println(tcs);
      if (s.matches(".*" + tcs + ".*")) {
        ans = Math.min(ans, ansCnt);
      }

    }
    System.out.println(ans);
    sc.close();
  }
}
