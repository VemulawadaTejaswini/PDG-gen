//  ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿>
//  ⣿         
//  ⣿ Author - midu_01C
//  ⣿         
//  ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿>

import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;

public class Main
{
    static Scanner cin = new Scanner(System.in);
    static PrintStream cout = new PrintStream
    (new FileOutputStream(FileDescriptor.out));
    
    public static void main(String args[])
    {
        int t,n,m,a,b,c,d,e,i,j,k,x,y,z,cnt=0;
        boolean flag = false; Vector v = new Vector();
        
        String s;
        s=cin.next();
        char[] ch=s.toCharArray();
        x=0;
        cnt=0;
        for(char c1:ch)
        {
            if(c1=='R') cnt++;
            else cnt=0;
            x=Math.max(x,cnt);
        }
        cout.println(x);
    }
}
