import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      String S = in.next();
      int[] count = new int[26];

      for (int i = 0; i < S.length(); ++i) {
        ++count[S.charAt(i) - 'A'];
      }
      
      int count2 = 0;
      for (int i = 0; i < count.length; ++i) {
        if (count[i] == 2) {
          ++count2;
        }
      }

      if (count2 == 2) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}