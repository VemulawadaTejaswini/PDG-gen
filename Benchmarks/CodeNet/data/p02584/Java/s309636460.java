import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    long x = sc.nextLong();
    long k = sc.nextLong();
    long d = sc.nextLong();
    
    long a = Math.abs(k - x/d);
    long b = x%d;
    
    if(x/k >= d){
      System.out.println(Math.abs(x - k*d));
      return;
    }
    
    if(a%2 == 0) {
      System.out.println(Math.abs(b));
    } else {
      if(Math.abs(b-d) > Math.abs(b+d)){
        System.out.println(Math.abs(b+d));
      } else {
        System.out.println(Math.abs(b-d));
      }
    }
  }
}