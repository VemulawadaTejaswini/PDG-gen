import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int k = scanner.nextInt();
    final int x = scanner.nextInt();
    if(500 * k >= x) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
