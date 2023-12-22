import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    String S = sc.next();
    String T = sc.next();
    Boolean f = false;
    int l = S.length();
    
    for(int i=0; i<=l; i++) {
      if(S.equals(T)) {
        f = true;
        break;
      } else {
        S = S.substring(l-1, l) + S.substring(0, l-1);
      }
    }
    if(f) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}