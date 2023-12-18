import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String c = sc.next();
    int d = c.charAt(0) - 'a';
    d++;
    String ans = String.valueOf((char)('a' + d));
    System.out.println(ans);
  }
}
