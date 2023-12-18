import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(in);
    long x,k,d;
    x = sc.nextLong();
    k = sc.nextLong();
    d = sc.nextLong();
    
    x = abs(x);
    if(x - k*d >= 0){
      out.println(x - k*d);
      
    }else if((k - (long)(x/d)) %2 == 0){
      out.println(x % d);
      
    }else if((k - (long)(x/d)) %2 == 1){
      out.println(abs((x - (long)(x/d)*d) - d));
    }
  }
}
