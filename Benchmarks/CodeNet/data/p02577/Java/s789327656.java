import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int length = s.length();
    long count = 0;
    for (int i = 0; i < length; i++) {
      count += (int) s.charAt(i) - 48;
    }
    if (count % 9 == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
