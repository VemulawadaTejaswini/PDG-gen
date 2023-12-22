import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      String S = in.next();
    
      int count = 0;
      int maxCount = 0;
      for (int i = 0; i < S.length(); ++i) {
        if (S.charAt(i) == 'A' || S.charAt(i) == 'T' || S.charAt(i) == 'G' || S.charAt(i) == 'C') {
          ++count;
          maxCount = Math.max(maxCount, count);
        } else {
          count = 0;
        }
      }

      System.out.println(maxCount);
    }
  }
}