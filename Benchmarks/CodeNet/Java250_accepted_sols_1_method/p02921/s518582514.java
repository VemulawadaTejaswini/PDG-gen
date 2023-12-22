import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    int count = 0;

    if(s.charAt(0) == t.charAt(0)) count++;

    if(s.charAt(1) == t.charAt(1)) count++;

    if(s.charAt(2) == t.charAt(2)) count++;

    System.out.println(count);

  }
}