import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String T = sc.next();
    StringBuilder SS = new StringBuilder(S);
    int check =0;
    for (int i=0; i<S.length(); i++) {
      String SSS = SS.substring(i,S.length()) + SS.substring(0,i);
      if (SSS.equals(T)) {
        check++;
        break;
      }
    }
    if (check != 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}