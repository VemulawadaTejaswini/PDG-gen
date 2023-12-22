import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();

    String a = "";
    int n = 0;
    for (int i = 0; i < s.length(); i++) {
      String t = s.substring(i, i+1);
      if (t.equals("B") && a.length() == 0) continue;
      if (t.equals("B") && a.length() != 0) {
        a = a.substring(0, n-1);
        n--;
      } else {
        a += t;
        n++;
      }
    }
    
    System.out.println(a);
  }
}