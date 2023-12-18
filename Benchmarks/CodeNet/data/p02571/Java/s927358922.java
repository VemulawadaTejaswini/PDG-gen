import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();

    int min = t.length();
    for (int i = 0; i <= s.length() - t.length(); i++) {
      String ss = s.substring(i, i + t.length());

      int count = 0;
      for (int j = 0; j < t.length(); j++) {
        if (ss.charAt(j) != t.charAt(j)) {
          count++;
        }
      }
      min = Math.min(count, min);
    }
    System.out.println(min);
  }
}