import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    
    long ans = 0L;
    long x = sc.nextLong();
    long k = sc.nextLong();
    long d = sc.nextLong();
    
    long a = Math.abs(x);
      
    if (a >= k*d){
      ans = a - (k*d);
    } else {
      k = k - (a/d);
      a = a%d;
      k = k%2;
      if (k == 0){
          ans = a;
      } else {
        if (a > d){
          ans = a-d;
        } else {
          ans = d-a;
        }
      }
    }
    
    System.out.println(ans);
  }
}