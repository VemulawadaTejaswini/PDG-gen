import java.util.*;
 
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int numA = sc.nextInt();
    int numB = sc.nextInt();
    int numC = sc.nextInt();
    
    int sum = numA + numB + numC;
    
    String res = "win";
    
    if (sum > 21){
      res = "bust";
    }
    
    System.out.println(res);
    
  }
}