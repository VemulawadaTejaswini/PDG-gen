import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    boolean ok = true;

    if (s.charAt(0) != 'A') {
      ok = false;
    }

    boolean cok = true;
    for (int i = 2; i < (s.length() - 1); i++) {
      if (s.charAt(i) == 'C') {
        if (!cok) {
          ok = false;
        } else {
          cok = false;
        }
      }
    }

    if (cok) {
      ok = false;
    }

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if ((c != 'A') && (c != 'C')) {
        if (!(('a' <= c) && (c <= 'z'))) {
          ok = false;
        }
      }
    }

    if (ok) {
      System.out.println("AC");
    } else {
      System.out.println("WA");
    }

  }
}