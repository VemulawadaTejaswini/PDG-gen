import java.util.Scanner;

public class Main {
  public static void main(final String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    sc.close();

    String o = "Yes";
    if (s.equals("AAA")) {
      o = "No";
    } else if (s.equals("BBB")) {
      o = "No";
    }

    System.out.println(o);
  }
}