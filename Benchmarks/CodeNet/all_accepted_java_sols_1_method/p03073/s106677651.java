import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int a = 0;
    int b = 0;
    for(int i = 0; i < s.length(); i++) {
      if(i % 2 == 0) {
        if(s.charAt(i) != '0') a++;
      } else {
        if(s.charAt(i) != '1') a++;
      }
    }
    for(int i = 0; i < s.length(); i++) {
      if(i % 2 == 0) {
        if(s.charAt(i) != '1') b++;
      } else {
        if(s.charAt(i) != '0') b++;
      }
    }
    int ans = Math.min(a, b);
    System.out.println(ans);
  }
}