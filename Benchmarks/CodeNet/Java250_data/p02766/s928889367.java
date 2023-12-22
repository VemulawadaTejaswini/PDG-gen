import java.io.*;
import java.util.*;

class Main
{
  public static void main (String[] arg)
  {
    Scanner scan = new Scanner(System.in);
    int n = Integer.parseInt(scan.next()); //整数
    int k = Integer.parseInt(scan.next()); //進数
    int d; //割られる数
    int count; //割った数
    
    d = n;
    
    if(d >= k){
      for(count = 0; (d / k) >= k; count ++){
        d = d / k;
      }
      count ++;
    }
    else{
      count = 0;
    }    
    System.out.println(count + 1);
    
  }
}