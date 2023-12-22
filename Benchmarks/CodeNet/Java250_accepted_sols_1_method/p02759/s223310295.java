import java.io.*;
import java.util.*;

class Main
{
  public static void main (String[] arg)
  {
    Scanner scan = new Scanner(System.in);
    int n = Integer.parseInt(scan.next()); //整数
    
    int m = n / 2;
    
    if(n % 2 == 1){
      m++;
    }
    
    System.out.println(m);
  }
}