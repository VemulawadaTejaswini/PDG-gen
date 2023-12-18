import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int i = 0;
    if(S.contains("E") && !S.contains("W")) {
      i = 1;
    }
    if(S.contains("N") && !S.contains("S")) {
      i = 1;
    }
    if(!S.contains("E") && S.contains("W")) {
      i = 1;
    }
    if(!S.contains("N") && S.contains("S")) {
      i = 1;
    }
    if(i==0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}