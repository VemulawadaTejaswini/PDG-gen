import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    
    String a = s.substring(0, 1);
    String b = s.substring(1, 2);
    String c = s.substring(2, 3);
    String d = s.substring(3, 4);
    
    if (a.equals(b) && b.equals(c) && c.equals(d)) {
      System.out.println("No");
    } else if (a.equals(b) && c.equals(d)) {
      System.out.println("Yes");
    } else if (a.equals(c) && b.equals(d)) {
      System.out.println("Yes");
    } else if (a.equals(d) && b.equals(c)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}