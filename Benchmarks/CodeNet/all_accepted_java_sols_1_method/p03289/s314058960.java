import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int f = 0;
    if(!((String.valueOf(s.charAt(0))).equals("A"))) f++;
    int p = 0;
    int q = 0;
    for(int i = 2; i < s.length() - 1; i++) {
      if((String.valueOf(s.charAt(i))).equals("C")) {
        p++;
        q = i;
      }
    }
    if(p != 1) f++;
    for(int i = 1; i < s.length(); i++) {
      if(q != i) {
        String a = (String.valueOf(s.charAt(i))).toLowerCase();
        if(!(a.equals(String.valueOf(s.charAt(i))))) f++;
      }
    }
    String ans = "AC";
    if(f > 0) ans = "WA";
    System.out.println(ans);
  }
}