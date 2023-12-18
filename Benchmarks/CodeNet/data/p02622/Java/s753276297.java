import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    
    int ans = 0;
    
    if(a.length() != b.length()) {
      System.out.println("-1");
    }
    
    for(int i=0; i<a.length(); i++) {
      if(a.charAt(i) != b.charAt(i)) {
        ans++;
      }
    }
    System.out.println(ans);
  }
}
