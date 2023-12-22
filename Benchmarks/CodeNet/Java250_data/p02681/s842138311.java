import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String s = sc.nextLine();
    String t = sc.nextLine().substring(0,s.length());
    System.out.println(s.equals(t) ? "Yes" : "No");
  }
}