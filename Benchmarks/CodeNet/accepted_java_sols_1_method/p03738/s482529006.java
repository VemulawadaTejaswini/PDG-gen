import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    String B = sc.next();
    int a = A.length();
    int b = B.length();
    String x = A.substring(0, 1);
    String y = B.substring(0, 1);
    if(A.equals(B)) {
      System.out.println("EQUAL");
    } else if(a > b) {
      System.out.println("GREATER");
    } else if(a < b) {
      System.out.println("LESS");
    } else {
      for(int i=0; i<a; i++) {
        if(x.equals(y)) {
          x = A.substring(i+1, i+2);
          y = B.substring(i+1, i+2);
        } else {
          if(Integer.parseInt(x) > Integer.parseInt(y)) {
            System.out.println("GREATER");
          } else {
            System.out.println("LESS");
          }
          break;
        }
      }
    }
  }
}