import java.io.*;
import java.util.*;
import java.util.ArrayList;
 
class Main
{
  public static void main (String[] arg)
  {
    Scanner scan = new Scanner(System.in);
    
    long a = Long.parseLong(scan.next()); //a
    long b = Long.parseLong(scan.next()); //b
    long c = Long.parseLong(scan.next()); //c
    
    long left = 4 * a * b;
    long d = c - a -b;
    long right = d * d;
    
    if(left < right && d > 0){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}