import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.Pattern;

 class Main {
    
    public static void main(String args[])
    {
     int a,b,i,small,sum=0;String s="";
     Scanner sc=new Scanner(System.in);
     a=sc.nextInt(); b=sc.nextInt();
     if(a<b)
     {
         small=a;
         for(i=b-1;i>=0;i--)
         {
             sum=sum+(int)Math.pow(10, i);
         }
         small=a*sum;
         s=""+small;
     }
     else
     {
         small=b;
         for(i=a-1;i>=0;i--)
         {
             sum=sum+(int)Math.pow(10, i);
         }
         small=b*sum;
         s=""+small;
     }
     System.out.println(s);
     }
}
