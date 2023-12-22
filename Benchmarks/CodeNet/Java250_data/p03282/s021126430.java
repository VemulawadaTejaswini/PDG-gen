import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String k = sc.next();
    int ans = 1;
    long nk = Long.parseLong(k);
    if(nk == 1) {
      ans = Integer.parseInt(String.valueOf(s.charAt(0)));
    } else {
      int len = s.length();
      if(nk <= len) {
        int n1 = (int)nk;
        for(int j = n1 - 1; j >= 0; j--) {
          int t = Integer.parseInt(String.valueOf(s.charAt(j)));
          if(t != 1) ans = t;
        }
      } else {
        for(int j = len - 1; j >= 0; j--) {
          int t = Integer.parseInt(String.valueOf(s.charAt(j)));
          if(t != 1) ans = t;
        }
      }
    }
    System.out.println(ans);
  }
}