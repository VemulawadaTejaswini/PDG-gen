import java.io.*;
import java.util.*;
class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s[]=bu.readLine().split(" ");
        long x=Math.abs(Long.parseLong(s[0])),k=Long.parseLong(s[1]),d=Long.parseLong(s[2]);
        long moves=x/d;
        if(moves==k)
        {
            x-=d*moves;
            sb.append(x);
        }
        else if(moves>k)
        {
            x-=d*k;
            sb.append(x);
        }
        else
        {
            k-=moves;
            x-=d*moves;
            long temp=Math.abs(x-d);
            if(temp<x)
            {
                k--;
                k%=2;
                x=temp;
                if(k==1) x=Math.min(Math.abs(x-d),Math.abs(x+d));
            }
            else
            {
                k%=2;
                if(k==1) x=Math.min(Math.abs(x-d),Math.abs(x+d));
                sb.append(x);
            }
        }
        System.out.print(sb);
    }
}