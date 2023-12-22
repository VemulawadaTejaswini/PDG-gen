import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      String S = in.next();
      String T = in.next();
      int count = 0;
      
      for (int i = 0; i < S.length(); ++i) {
        if (S.charAt(i) == T.charAt(i)) {
          ++count;
        }
      }

      System.out.println(count);
    }
  }
}