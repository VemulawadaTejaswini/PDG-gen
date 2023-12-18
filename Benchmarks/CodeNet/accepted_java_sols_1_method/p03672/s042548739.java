import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String ans ="";
    for (int i=S.length()-1; i>0 ; i--) {
      if (i % 2 == 0) {
        String S1 = S.substring(0,i/2);
        String S2 = S.substring(i/2,i);
        if (S1.equals(S2)) {
          ans = S1 + S2;
          break;
        }
      }
    }
    System.out.println(ans.length());
  }
}