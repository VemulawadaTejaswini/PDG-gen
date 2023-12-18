import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int k = sc.nextInt();
    
    if( a < b && b < c) {
      System.out.print("Yes");
      return;
    }
    
    int cnt = 0;
      
    if(a >= b){
      while(true) {
        b *= 2;
        cnt++;
        if(a < b)
          break;
      }
    }
    
    if(b >= c){
      while(true) {
        c *= 2;
        cnt++;
        if(b < c)
          break;
      }
    }
    
    if(cnt <= k)
      System.out.print("Yes");
    else
      System.out.print("No");
  }
}
