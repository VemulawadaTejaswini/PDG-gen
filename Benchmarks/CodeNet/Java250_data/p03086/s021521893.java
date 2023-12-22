import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String S = in.next();

    int ans = 0;
    for (int i = 0; i < S.length(); i++) {
      for (int j = i + 1; j <= S.length(); j++) {
        String s = S.substring(i, j);
        boolean match = true;
        for (int k = 0; k < s.length(); k++) {
          char c = s.charAt(k);
          if (!(c == 'A' || c == 'C' || c == 'G' || c == 'T')) {
            match = false;
          }
        }
        if (match) {
          ans = Math.max(ans, s.length());
        }
      }
    }
    
    System.out.println(ans);
  }
}