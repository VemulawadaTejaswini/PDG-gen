import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int a = 0;
    int b = 0;
    for(int i = 0; i < s.length(); i++) {
      if(s.charAt(i) == '0') {
        a++;
      } else {
        b++;
      }
    }
    int ans = 2 * (Math.min(a, b));
    System.out.println(ans);
  }
}