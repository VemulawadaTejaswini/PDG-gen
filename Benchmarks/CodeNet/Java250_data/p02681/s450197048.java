import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    if (t.length() - s.length() == 1 && t.indexOf(s) == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}