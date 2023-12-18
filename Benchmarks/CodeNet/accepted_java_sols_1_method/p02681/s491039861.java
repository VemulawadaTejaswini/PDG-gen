import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();

    String d = t.substring(0,s.length());

    if (s.equals(d)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }


  }

}
