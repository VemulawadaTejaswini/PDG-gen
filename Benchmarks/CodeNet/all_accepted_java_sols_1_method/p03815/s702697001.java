import java.util.*;

class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    long X = sc.nextLong();
    long ans = 0;
    ans += X / 11 * 2;
    
    if(X % 11 > 0){
      if(X % 11 <= 6) ans += 1;
      else ans += 2;
    }
    
    System.out.println(ans);
  }
}
    