import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    String B = sc.next();
    String C = sc.next();
    
    if(A.equals(B) && B.equals(C)) {
      System.out.println("No");
    } else if(A.equals(B) || B.equals(C) || A.equals(C)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}