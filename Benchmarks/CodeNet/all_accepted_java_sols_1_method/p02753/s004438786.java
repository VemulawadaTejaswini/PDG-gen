import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    if (s.charAt(0)=='A'&&s.charAt(1)=='A'&&s.charAt(2)=='A'||s.charAt(0)=='B'&&s.charAt(1)=='B'&&s.charAt(2)=='B') {
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
  }
}
