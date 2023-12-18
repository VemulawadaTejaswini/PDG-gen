import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int k = sc.nextInt();
    String ans = "";
    for(int i = 0; i < n; i++) {
      String str = String.valueOf(s.charAt(i));
      if(s.charAt(i) == s.charAt(k - 1)) {
        ans += str;
      } else {
        ans += "*";
      }
    }
    System.out.println(ans);
  }
}