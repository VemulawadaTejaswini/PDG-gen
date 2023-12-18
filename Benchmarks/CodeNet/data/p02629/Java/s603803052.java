import java.util.*;
import java.io.*;

public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    long a[]=new long[13];
    for(int i=0;i<a.length;i++)
     {
      long pow=12-i;
      long div=(long)Math.pow(26,pow);
      a[i]=n/div;
      n=n-(a[i]*div);
    }
  String ans="";
   for(int i=0;i<a.length;i++)
   {
     if(a[i]==0)
       continue;
     else
       ans+=(char)(a[i]+96);
   }
     System.out.println(ans);
  }
}