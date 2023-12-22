import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    String s = sc.next();
    String t = sc.next();
    
    for (int i = 0; i < n; i++) {
      String ss = s.substring(i, i + 1);
      String tt = t.substring(i, i + 1);
      System.out.print(ss + tt);
    }
    System.out.print(s.substring(n));
    System.out.print(t.substring(n));
  }
}