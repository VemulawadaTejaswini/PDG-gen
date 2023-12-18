import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String T = sc.next();
    HashMap<String, String> m1 = new HashMap<String, String>();
    HashMap<String, String> m2 = new HashMap<String, String>();
    int p = 0;
    for(int i = 0; i < S.length(); i++) {
      String s = String.valueOf(S.charAt(i));
      String t = String.valueOf(T.charAt(i));
      if(m1.containsKey(s)) {
        if(!((m1.get(s)).equals(t))) p = 1;
      } else {
        m1.put(s, t);
      }
      if(m2.containsKey(t)) {
        if(!((m2.get(t)).equals(s))) p = 1;
      } else {
        m2.put(t, s);
      }
    }
    String ans = "Yes";
    if(p == 1) ans = "No";
    System.out.println(ans);
  }
}