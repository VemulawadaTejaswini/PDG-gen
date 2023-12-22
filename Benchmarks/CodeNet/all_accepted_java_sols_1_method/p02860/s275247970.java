import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.Pattern;

class Main {
    public static void main(String args[])
    {
     String s,s11="",s2="";int a;
     Scanner sc=new Scanner(System.in);
     a=sc.nextInt();
     s=sc.next();
    String s1[]=s.split("");
    if(a%2==0)
    {
        for(int i=0;i<s1.length/2;i++)
        {
            s11=s11+s1[i];
        }
        for(int i=(s1.length)/2;i<s1.length;i++)
        {
            s2=s2+s1[i];
        }
        if(s11.equals(s2))
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
    }
    else
    {
        System.out.print("No");
    }
    }
}

