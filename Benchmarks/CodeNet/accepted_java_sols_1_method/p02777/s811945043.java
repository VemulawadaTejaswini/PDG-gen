import java.util.*;

public class Main {
  public static void main(final String[] args) {
    final Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    int a = sc.nextInt();
    int b = sc.nextInt();
    String u = sc.next();
    sc.close();

    if (s.equals(u)) {
      System.out.println((a - 1) + " " + b);
    } else {
      System.out.println(a + " " + (b - 1));
    }
  }
}