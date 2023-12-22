import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String pat = "";
    for (int i = 0; i < 50001; i++) {
      pat += "01";
    }

    String s = sc.next();
    int n01 = 0;
    int n10 = 0;

    for (int i = 0; i < s.length(); i++) {
      if (pat.charAt(i) != s.charAt(i)) {
        n01++;
      }
    }

    for (int i = 0; i < s.length(); i++) {
      if (pat.charAt(i + 1) != s.charAt(i)) {
        n10++;
      }
    }

    System.out.println(Math.min(n01, n10));

  }
}