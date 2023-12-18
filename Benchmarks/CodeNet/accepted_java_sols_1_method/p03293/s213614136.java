import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();

    for (int i = 0; i < s.length(); i++) {
      String first = s.substring(0,i);
      String last = s.substring(i,s.length());
      String full = last + first;

      if (t.equals(full)) {
        System.out.println("Yes");
        return;
      }
    }

    System.out.println("No");
    
  }
}
