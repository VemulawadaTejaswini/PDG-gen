import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String a = sc.next();

    if (a.equals("AAA") || a.equals("BBB")) {
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }
  }
}
