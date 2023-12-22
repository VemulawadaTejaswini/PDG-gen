import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int ans = 0;
    for(int i = 0; i < n; i++) {
      if(i < (n - 1)) {
        if(s.charAt(i) != s.charAt(i + 1)) ans++;
      } else {
        ans++;
      }
    }
    System.out.println(ans);
  }
}