import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    
    double a = sc.nextFloat();
    double b = sc.nextFloat();
    
    double ansD = a*b;
        
    ansD = Math.floor(ansD);
    
    int ans = (int)ansD;
    
    System.out.println(ans);
  }
}