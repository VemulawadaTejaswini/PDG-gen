import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();

    if (S.equals("AAA") || S.equals("BBB")) {
      System.out.println("No");
      return;
    }
    
    System.out.println("Yes");
    
  }
}