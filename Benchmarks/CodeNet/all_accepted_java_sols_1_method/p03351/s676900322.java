import java.util.*;

public class Main{
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    
    int ab = b-a;
    int bc = c-b;
    int ca = c-a;
    
    ab = Math.abs(ab);
    bc = Math.abs(bc);
    ca = Math.abs(ca);
    
    if(ab <= d && bc <= d){
      System.out.println("Yes");
    }else if((a == b && b == c && c == a) || a == c){
      System.out.println("Yes");
    }else if(ca <= d){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
    
  }
  
}