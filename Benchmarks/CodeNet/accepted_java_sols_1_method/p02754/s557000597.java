import java.io.*;
import java.util.*;
import java.util.ArrayList;
 
class Main
{
  public static void main (String[] arg)
  {
    Scanner scan = new Scanner(System.in);
    
    long N = scan.nextLong(); //整数    
    long A = scan.nextLong(); //整数    蒼
    long B = scan.nextLong(); //整数　　赤
    
    long ans = 0;
    
    if(A == 0){
      System.out.println(0);
    }
    
    else{
      
      ans = (N / (A + B)) * A;
      
      if((N % (A + B)) >= A){
        ans = ans + A;
      }
      else{
        
        ans = ans + N % (A + B);
      }
      System.out.println(ans);
    }
  }
}
