import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    
    double a = sc.nextDouble();
    int aInt = (int) a;
    
    double sqrt = Math.sqrt(a);
    
    double cbrt = Math.cbrt(a);
    
    int ans = 0;
    
    int s = (int) sqrt;
    int s1 = s*s;
    
    int c = (int) cbrt;
    int c1 = c*c*c;
    
    if (s1 < c1){
      ans = c1;
    } else {
      ans = s1;
    }
    
    if (ans < 32 && 32 <= aInt){
      ans = 32;
    } else if (ans < 128 && 128 <= aInt){
      ans = 128;
    } else if (ans < 243 && 243 <= aInt){
      ans = 243;
    }
    
    System.out.println(ans);
    
  }
}