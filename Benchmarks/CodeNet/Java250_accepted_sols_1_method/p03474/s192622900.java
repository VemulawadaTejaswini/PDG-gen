import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    String s = sc.next();
    String ans = "Yes";
    if(s.length() == a + b + 1) {
    for(int i = 0; i < a + b + 1; i++) {
      char t = s.charAt(i);
      String str;
      if(i < a) {
        str = String.valueOf(t);
        try {
          int m = Integer.parseInt(str);
        } catch(NumberFormatException e) {
          ans = "No";
          break;
        }
      } else if(i == a) {
        if(t != '-') {
          ans = "No";
          break;
        }
      } else {
        str = String.valueOf(t);
        try {
          int m = Integer.parseInt(str);
        } catch(NumberFormatException e) {
          ans = "No";
          break;
        }
      }
    }
    }
    if(s.length() != (a + b + 1)) ans = "No";
    System.out.println(ans);
  }
}
