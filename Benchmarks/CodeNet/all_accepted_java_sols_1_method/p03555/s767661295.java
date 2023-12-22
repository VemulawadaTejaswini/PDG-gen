import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    String t = sc.next();
    
    String s1 = s.substring(0, 1);
    String s2 = s.substring(1, 2);
    String s3 = s.substring(2, 3);
    
    String t1 = t.substring(0, 1);
    String t2 = t.substring(1, 2);
    String t3 = t.substring(2, 3);
    
    if (s1.equals(t3) && s2.equals(t2) && s3.equals(t1)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}