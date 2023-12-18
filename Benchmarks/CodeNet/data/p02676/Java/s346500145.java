import java.util.*;

class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    final int k = sc.nextInt();
    final String s = sc.next();
    if (s.length() <= k) {
      System.out.println(s);
    } else {
      System.out.println(s.substring(0, k) + "...");
    }
  }
}
