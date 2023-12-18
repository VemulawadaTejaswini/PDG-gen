import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String s = a.toUpperCase();
    if(a.equals(s)) {
      System.out.println("A");
    } else {
      System.out.println("a");
    }
  }
}