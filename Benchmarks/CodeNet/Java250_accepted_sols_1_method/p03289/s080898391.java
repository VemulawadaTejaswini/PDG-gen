import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    String S = sc.next();

    sc.close();

    String result = "WA";

    char[] s = S.toCharArray();
    String[] s_= S.split("");

    if (s_[0].equals("A")) {

      int count = 0;
      int position = 0;

      for (int i = 2; i <= s_.length - 2; i++) {
        if (s_[i].equals("C")) {
          count++;
          position = i;
        }
      }

      if (count == 1) {
        for (int i = 1; i < s.length; i++) {
          if (i != position){
            if (97 <= (int)s[i] && (int)s[i] <= 122) {
              result = "AC";
            } else {
              result = "WA";
              break;
            }
          }
        }
      }

    }

    System.out.println(result);

  }

}