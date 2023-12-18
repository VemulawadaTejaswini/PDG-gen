import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    if(A%2 != B%2){
      System.out.println("IMPOSSIBLE");
      return;
    }
    
    System.out.println((A+B)/2);
  }
}