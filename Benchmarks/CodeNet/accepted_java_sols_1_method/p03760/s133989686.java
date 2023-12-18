import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String o = sc.next();
    String e = sc.next();

    if (o.length() == e.length()) {
      for (int i = 0; i < o.length(); i++) {
        System.out.print(o.charAt(i)+""+e.charAt(i));
      }
      System.out.println();
    } else if (o.length() - e.length() == 1) {
      for (int i = 0; i < e.length(); i++) {
        System.out.print(o.charAt(i)+""+e.charAt(i));
      }
      System.out.println(o.charAt(o.length()-1));
    }

  }

}
