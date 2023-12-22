import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    char[] c = str.toCharArray();
    boolean ans = true;

    for (int i = 0 ; i < str.length() ; i++ ) {
      if (i%2 == 0 && c[i] == 'L' || i%2 == 1 && c[i] == 'R') {
          ans = false;
          break;
        }
      }




    if (ans) {
      System.out.println("Yes");
    } else {
    System.out.println("No");
    }
  }
}
