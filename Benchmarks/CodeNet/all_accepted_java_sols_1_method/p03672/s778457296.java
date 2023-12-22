import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    
    int ans = 0;
    for (int i = S.length()-2; i >= 2; i-=2) {
      if (S.substring(0, i/2).equals(
        S.substring(i/2, i))) {
        ans = i;
        break;
      }
    }
    System.out.println(ans);
  }
}