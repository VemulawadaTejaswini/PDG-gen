import java.util.*;
import java.util.Scanner;
import java.lang.*;

public class Main
{
  public static void main(String args[])
  {
    try
    {
    int n,rem=0,res=0,a=0,r=0,w=0,t=0;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    String str;  
    for(int i=0;i<n;i++)  
    {
      str=s.next();
      if(str.charAt(0)=='A') 
      {
        a++;
      }
      else if(str.charAt(0)=='W') 
      {
        w++;
      }
      else if(str.charAt(0)=='T') 
      {
        t++;
      }
      else if(str.charAt(0)=='R') 
      {
        r++;
      }
      else
      {
        continue;
      }
    }
      
      System.out.println("AC x "+a);
      System.out.println("WA x "+w);
	 System.out.println("TLE x "+t);
	 System.out.println("RE x "+r);


      
      
      
      
      
   
  //    System.out.println(res);
    }
    catch(Exception e)
    {
      return ;
    }
  }
}
      
   
    