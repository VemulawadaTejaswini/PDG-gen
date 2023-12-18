import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(in);
    int x,k,d;
    x = sc.nextInt();
    k = sc.nextInt();
    d = sc.nextInt();
    
    x = abs(x);
    if(x - k*d >= 0){
      out.println(x - k*d);
      
    }else if((k - (int)(x/d)) %2 == 0){
      out.println(x - (int)(x/d)*d);
      
    }else{
      out.println(abs((x - (int)(x/d)*d) - d));
    }
  }
}