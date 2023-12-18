import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    
    System.out.print(S.charAt(0));
    System.out.print(S.length()-2);
    System.out.print(S.charAt(S.length()-1));
    System.out.println("");
  }
}