import java.io.*;
import java.util.*;
 
public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    long a = scan.nextLong();
    long b = scan.nextLong();
    long m = a*b;
    if(m<1000000000000000000)
      System.out.println(-1);
    else
    	System.out.println(a*b);
  }
}