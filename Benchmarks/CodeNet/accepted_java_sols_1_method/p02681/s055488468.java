import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String T = sc.next();
    sc.close();

    boolean ans = T.startsWith(S) && T.length() == S.length() + 1;
    System.out.println(ans ? "Yes" : "No");
  }
}
