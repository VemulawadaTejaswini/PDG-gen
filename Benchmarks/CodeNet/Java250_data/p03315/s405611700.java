import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String S = sc.next();
    
    String first = S.substring(0, 1);
    String second = S.substring(1, 2);
    String third = S.substring(2, 3);
    String fourth = S.substring(3, 4);

    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;

    if (first.equals("+")) {
      a = 1;
    } else {
      a = -1;
    }
    if (second.equals("+")) {
      b = 1;
    } else {
      b = -1;
    }
    if (third.equals("+")) {
      c = 1;
    } else {
      c = -1;
    }
    if (fourth.equals("+")) {
      d = 1;
    } else {
      d = -1;
    }

    System.out.println(a + b + c + d);
  }
}