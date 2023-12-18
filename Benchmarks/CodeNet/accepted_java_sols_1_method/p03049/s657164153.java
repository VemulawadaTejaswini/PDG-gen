import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 0;
    int a = 0;
    int b = 0;
    int c = 0;
    for(int i = 0; i < n ;i++) {
      String s = sc.next();
      for(int j = 0; j < s.length() - 1; j++) {
        if((s.charAt(j) == 'A') && (s.charAt(j + 1) == 'B')) ans++;
      }
      if(s.charAt(s.length() - 1) == 'A') {
        if(s.charAt(0) == 'B') {
          c++;
        } else {
          a++;
        }
      } else if(s.charAt(0) == 'B') {
        b++;
      }
    }
    int r = 0;
    if(c == 0) {
      r = Math.min(a, b);
    } else {
      if(a == 0) {
       if(b == 0) {
         r = c - 1;
       } else {
         r = c;
       }
      } else if(b == 0) {
        r = c;
      } else {
        r = c + Math.min(a - 1, b - 1) + 1;
      }
    }
    ans += r;
    System.out.println(ans);
  }
}