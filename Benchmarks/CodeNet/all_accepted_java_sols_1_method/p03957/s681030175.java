import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int i = 0;
    boolean ok = false;

    for (i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'C') {
        break;
      }
    }

    for (; i < s.length(); i++) {
      if (s.charAt(i) == 'F') {
        ok = true;
        break;
      }
    }

    if (ok) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
}