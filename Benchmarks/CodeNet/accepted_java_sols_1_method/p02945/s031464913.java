import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    
    int X = A + B;
    int Y = A - B;
    int Z = A * B;
    
    int ans = Math.max(X, Math.max(Y, Z));
    
    System.out.println(ans);
  }
}