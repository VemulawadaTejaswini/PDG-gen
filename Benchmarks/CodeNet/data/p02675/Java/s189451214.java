import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    String end = n.substring(n.length()-1);
    int num = Integer.parseInt(end);
    
    switch(num){
      case 3:
        System.out.println("bon");
      case 0:
      case 1:
      case 6:
      case 8:
        System.out.println("pon");
        
      default:
        System.out.println("hon");
    }
  }
}