import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    if (s.charAt(2) == s.charAt(3)) {
      if (s.charAt(4) == s.charAt(5)) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    } else {
      System.out.println("No");
    }
    sc.close();
  }
}