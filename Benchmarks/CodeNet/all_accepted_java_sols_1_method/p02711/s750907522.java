
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String n = scanner.next();
    if(n.contains("7")) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
