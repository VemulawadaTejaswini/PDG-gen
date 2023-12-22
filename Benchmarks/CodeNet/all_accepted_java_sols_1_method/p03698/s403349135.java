import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    boolean[] b = new boolean[26];

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (b[c - 'a']) {
        System.out.println("no");
        return;
      } else {
        b[c - 'a'] = true;
      }
    }

    System.out.println("yes");

  }
}