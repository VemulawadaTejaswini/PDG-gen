import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int ans = 0;
    int p = 0;
    int q = 0;
    for(int i = 0; i < s.length(); i++) {
      if(s.charAt(i) == '0') {
        p++;
      } else {
        q++;
      }
    }
    ans = 2 * Math.min(p, q);
    System.out.println(ans);
  }
}