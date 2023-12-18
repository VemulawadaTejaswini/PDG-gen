import java.util.*;

public class Main {

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int k = scan.nextInt();
    String str = scan.next();

    int n = str.length();

    if (n <= k) {
      System.out.println(str);
      return;
    }

    System.out.println(str.substring(0, k) + "...");
  }
}