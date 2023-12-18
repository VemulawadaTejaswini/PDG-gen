import java.util.Scanner; 

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      String S = in.next();
      int former = Integer.valueOf(S.substring(0, 2));
      int later = Integer.valueOf(S.substring(2));

      String ans = "";
      if (former == 0) {
        if (later == 0 || later > 12) {
          ans = "NA";
        } else {
          ans = "YYMM";
        }
      } else if (former <= 12) {
        if (later == 0 || later > 12) {
          ans = "MMYY";
        } else if (later <= 12) {
          ans = "AMBIGUOUS";
        }        
      } else if (former > 12) {
        if (later == 0 || later > 12) {
          ans = "NA";
        } else {
          ans = "YYMM";
        }
      }

      System.out.println(ans);
    }
  }
}