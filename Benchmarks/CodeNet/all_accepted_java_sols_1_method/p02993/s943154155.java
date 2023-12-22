import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      String S = in.next();
      boolean isGood = true;
   
      for (int i = 1; i < S.length(); ++i) {
        if (S.charAt(i) == S.charAt(i - 1)) {
          isGood = false;
        }
      }
      
      if (isGood) {
        System.out.println("Good");
      } else {
        System.out.println("Bad");
      }
    }
  }
}