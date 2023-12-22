import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String ans = "";
    for(int i = 0; i < s.length(); i++) {
      if(i == 3) {
        ans += "8";
      } else {
        String str = String.valueOf(s.charAt(i));
        ans += str;
      }
    }
    System.out.println(ans);
  }
}
