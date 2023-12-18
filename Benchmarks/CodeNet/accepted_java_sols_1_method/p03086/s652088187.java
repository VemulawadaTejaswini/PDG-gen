import java.io.*;
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
      int count=0,maxcount=0;
    for(int i=0;i<s.length();i++)
    {
    	if(s.charAt(i)=='A' || s.charAt(i)=='C' || s.charAt(i)=='G' || s.charAt(i)=='T')
    	{
    		
    		count++;
    		//System.out.println("counting"+count);
    		if(maxcount<=count)
    		{
    			maxcount=count;
    		}
    	}

    	else
    	{
    		if(maxcount<=count)
    		{
    			maxcount=count;
    		}
    		count=0;
    		//System.out.println("died");
    	}
    }
    System.out.println(maxcount);
   }
 }
    
