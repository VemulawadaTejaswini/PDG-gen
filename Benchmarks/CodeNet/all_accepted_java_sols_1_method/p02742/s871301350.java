import java.io.*;
import java.util.*;
import java.util.ArrayList;
 
class Main
{
  public static void main (String[] arg)
  {
    Scanner scan = new Scanner(System.in);
    
    long H = Integer.parseInt(scan.next()); //H
    long W = Integer.parseInt(scan.next()); //H
    
    long ans = 0;
    
    if(H == 1 && W != 1){
      ans = 1;
    }
    else if(H != 1 && W == 1){
      ans = 1;
    }
      
    else if(H % 2 == 1 && W % 2 ==1){
      ans = (H * W)/2 + 1;
    }
    else{
      ans = (H * W)/2;
    }
    System.out.println(ans);
  }
}
