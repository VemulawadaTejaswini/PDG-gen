import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int ans = 0;
    char temp = '9';
    for(int i = 0; i < n; i++) {
      char c = s.charAt(i);
      if(temp != c) {
        ans++;
        temp = c;
      }
    }
    System.out.println(ans);
  }
}
