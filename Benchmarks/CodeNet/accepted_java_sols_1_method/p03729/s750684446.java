import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    String c = sc.next();
    String one = a.substring(a.length()-1);
    String two = b.substring(0,1);
    String three = b.substring(b.length()-1);
    String four = c.substring(0,1);

    if (one.equals(two) && three.equals(four)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }

}
