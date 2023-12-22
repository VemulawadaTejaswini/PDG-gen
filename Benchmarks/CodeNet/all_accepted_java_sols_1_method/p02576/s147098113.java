import java.util.*;
 
public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int t = sc.nextInt();
    
    if(n%x != 0){
      int k = n/x+1;
      System.out.println(k*t);
      return;
    }else{
      int l = n/x;
      System.out.println(l*t);
      return;
    }
    
  }
}