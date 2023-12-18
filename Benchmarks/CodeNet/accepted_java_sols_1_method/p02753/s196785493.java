import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.Pattern;
class Main
{
		// your code goes here
		public static void main(String args[])
		{
                   // Comparator cmprtr=null;
                   String s;int a=0,b=0;
                   Scanner sc=new Scanner(System.in);
                   s=sc.next();
                   String s1[]=s.split("");
                   for(int i=0;i<3;i++)
                   {
                       if(s1[i].equals("A"))
                       {
                           a++;
                       }
                       else
                       {
                           b++;
                       }
                   }
                   if(a>0 && b>0)
                   {
                       System.out.print("Yes");
                   }
                   else
                   {
                       System.out.println("No");
                   }
                }}