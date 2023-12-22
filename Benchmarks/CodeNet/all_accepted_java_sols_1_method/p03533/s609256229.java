import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String rexp = "^A?KIHA?BA?RA?$";
    if (s.matches(rexp)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
