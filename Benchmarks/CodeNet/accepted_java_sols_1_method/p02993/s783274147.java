import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    
    String first = s.substring(0,1);
    String second = s.substring(1,2);
    String third = s.substring(2,3);
    String fourth = s.substring(3,4);
    
    if (first.equals(second)) {
      System.out.println("Bad");
    } else if (second.equals(third)) {
      System.out.println("Bad");
    } else if (third.equals(fourth)) {
      System.out.println("Bad");
    } else {
      System.out.println("Good");
    }
  }
}