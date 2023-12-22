import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    s += sc.next();
    s += sc.next();
    s += sc.next();

    if (s.contains("1") && s.contains("9") && s.contains("4") && s.contains("7")) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

  }
}