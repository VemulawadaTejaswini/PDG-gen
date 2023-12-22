import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    String s1=  sc.next();
    String s2 = sc.next();
    int v1 = sc.nextInt();
    int v2 = sc.nextInt();
    String result = sc.next();
    if (s1.equals(result)) {
      v1--;
      System.out.println(v1 + " " + v2);
    }
    else {
      v2--;
      System.out.println(v1 + " " + v2);
    }
  }
}