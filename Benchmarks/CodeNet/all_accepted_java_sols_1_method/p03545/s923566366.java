import java.util.*;
 
public class Main {
  public static void main(String[] args)  {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int a = Integer.parseInt(s.substring(0, 1));
    int b = Integer.parseInt(s.substring(1, 2));
    int c = Integer.parseInt(s.substring(2, 3));
    int d = Integer.parseInt(s.substring(3, 4));
    
    if (a + b + c + d == 7) {
      System.out.println(a + "+" + b + "+" + c + "+" + d + "=7");
      return;
    }
    if (a + b + c - d == 7) {
      System.out.println(a + "+" + b + "+" + c + "-" + d + "=7");
      return;
    }
    if (a + b - c + d == 7) {
      System.out.println(a + "+" + b + "-" + c + "+" + d + "=7");
      return;
    }
    if (a + b - c - d == 7) {
      System.out.println(a + "+" + b + "-" + c + "-" + d + "=7");
      return;
    }
    if (a - b + c + d == 7) {
      System.out.println(a + "-" + b + "+" + c + "+" + d + "=7");
      return;
    }
    if (a - b + c - d == 7) {
      System.out.println(a + "-" + b + "+" + c + "-" + d + "=7");
      return;
    }
    if (a - b - c + d == 7) {
      System.out.println(a + "-" + b + "-" + c + "+" + d + "=7");
      return;
    }
    if (a - b - c - d == 7) {
      System.out.println(a + "-" + b + "-" + c + "-" + d + "=7");
      return;
    }
  }
}