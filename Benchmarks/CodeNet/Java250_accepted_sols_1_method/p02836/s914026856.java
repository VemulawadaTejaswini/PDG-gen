import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    sc.close();
    
    int l = S.length() / 2;
    String s1 = S.substring(0, l);
    String s2 = S.substring(S.length() - l);
    
    int ans = 0;
    for (int i = 0; i < l; i++)
      if (s1.charAt(i) != s2.charAt(s2.length() - i - 1)) ans++;
    System.out.println(ans);
  }
}
