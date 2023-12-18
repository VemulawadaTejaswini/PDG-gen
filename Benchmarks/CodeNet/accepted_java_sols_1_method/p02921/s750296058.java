import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    String t = sc.next();

    int cnt = 0;
    if (s.substring(0,1).equals(t.substring(0,1))) cnt++;
    if (s.substring(1,2).equals(t.substring(1,2))) cnt++;
    if (s.substring(2,3).equals(t.substring(2,3))) cnt++;
    
    System.out.println(cnt);
  }
}
