import java.util.*;

class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int k = sc.nextInt();
    String s = new String(sc.next());
    int num = s.length();
    if (num <= k) {
      System.out.println(s);
    } else {
      String a = s.substring(0, k);
      System.out.println(a + "...");
    }
  }
}