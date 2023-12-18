import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    String s1 = sc.next();
    int n = s.length();
    
    if (s1.substring(0,n ).equals(s)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}