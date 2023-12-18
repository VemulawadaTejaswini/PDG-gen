import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    String c = sc.next();
    
    System.out.println(""
      +(char)('A'+a.charAt(0)-'a')
      +(char)('A'+b.charAt(0)-'a')
      +(char)('A'+c.charAt(0)-'a'));
  }
}