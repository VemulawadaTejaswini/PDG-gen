import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    String ans = "No";
    if(s.equals(t)) ans = "Yes";
    for(int i = 1; i < s.length(); i++) {
      String s1 = s.substring(0, s.length() - i);
      String s2 = s.substring(s.length() - i);
      String s0 = s2 + s1;
      if(s0.equals(t)) ans = "Yes";
    }
    System.out.println(ans);
  }
}