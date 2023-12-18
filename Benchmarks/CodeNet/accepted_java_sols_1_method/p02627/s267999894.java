import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();

    if (Pattern.matches("[a-z]", a)) {
      System.out.println("a");
    } else {
      System.out.println("A");
    }
  }
}
