import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    String ans = "";
    for(int i = 0; i < 3; i++) {
      String a = String.valueOf(n.charAt(i));
      if(a.equals("1")) {
        a = "9";
      } else {
        a = "1";
      }
      ans += a;
    }
    System.out.println(ans);
  }
}