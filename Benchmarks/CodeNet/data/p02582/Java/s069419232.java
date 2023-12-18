import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    int count = 0;
    int ans = 0;
    for (int i = 0; i < 3; i++) {
      if(a.charAt(i) == 'R') {
        count++;
        ans = Math.max(ans, count);
      } else {
        count = 0;
      }
    }
    System.out.println(ans);
  }
}
