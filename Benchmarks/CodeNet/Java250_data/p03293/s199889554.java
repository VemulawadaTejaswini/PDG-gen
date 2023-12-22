import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

 class Main
 {
    static boolean ischeck(char[] xx,char[] yy)
    {
        for(int j=0;j<xx.length;j++)
        {
            if(xx[j]!=yy[j])
                return false;
        }
        return true;
    }
    static int fun(char[] X,char[] Y,int left)
    {
        int flag=0;
        if(X.length==Y.length)
        {
            char[] xx=new char[X.length];
            
            for(int j=0;j<X.length;j++)
            {
                xx[(left+j)%X.length]=X[j];
            }
            if(ischeck(xx,Y))
            {
                return 1;
            }   
        }
        else
            return 0;
        return 0;
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        char[] x=s.toCharArray();
        char[] y=t.toCharArray();
        int flag=0;
        for (int i=0;i<s.length() ;i++ ) 
        {
           if (fun(x,y,i)==1) 
           {
                flag=1;
                break;
           }
            else
                flag=0;
        }
        if(flag==1)
            System.out.println("Yes");
        else
            System.out.println("No");
        
    }
}