import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      String S = in.next();
      long K = in.nextLong();
      char sol = '1';

      for (int i = 0; i < S.length(); ++i) {
        if (S.charAt(i) != '1') {
          if (K - 1 >= i) {
            sol = S.charAt(i);
            break;
          }          
        }
      }

      System.out.println(sol);
    }
  }
}