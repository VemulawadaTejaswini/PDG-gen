import java.util.*;
import java.util.regex.Pattern;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    String t = sc.next();

    if(s.length() <= 0 || s.length() >= 11) {
      System.out.println("No");
      System.exit(0);
    }

    if((t.length()-s.length()) != 1) {
      System.out.println("No");
      System.exit(0);
    }

    if(isHalfAlphanumeric(s) == false) {
      System.out.println("No");
      System.exit(0);
    }

    if(isHalfAlphanumeric(t) == false) {
      System.out.println("No");
      System.exit(0);
    }

    if(t.substring(0, s.length()).equals(s)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    sc.close();
  }
  public static boolean isHalfAlphanumeric(String str) {
    return Pattern.matches("^[a-z]+$", str);
  }
}