import java.io.*;
import java.math.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s[]=bu.readLine().split(" ");
        int x=Integer.parseInt(s[0]),n=Integer.parseInt(s[1]);
        int i,c[]=new int[201];
        if(n>0) s=bu.readLine().split(" ");
        for(i=0;i<n;i++)
        c[Integer.parseInt(s[i])]++;
        int min=Integer.MAX_VALUE,minv=x;
        for(i=0;i<=200;i++)
        if(c[i]==0 && Math.abs(i-x)<min) {min=Math.abs(i-x); minv=i;}
        System.out.print(minv);
    }
}
