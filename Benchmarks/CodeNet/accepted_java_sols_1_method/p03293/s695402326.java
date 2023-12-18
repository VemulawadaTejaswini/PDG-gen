import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    
    
    while (in.hasNext()) {
      String S = in.next();
      String T = in.next();
      boolean rotationEqual = false;

      for (int i = 0; i < S.length(); ++i) {
        if (T.equals(S.substring(i) + S.substring(0, i))) {
          rotationEqual = true;
          break;
        }
      }

      if (rotationEqual) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}