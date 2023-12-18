import java.io.*;
import java.math.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(bu.readLine()),i,f=0;
        long a[]=new long[n];
        String s[]=bu.readLine().split(" ");
        for(i=0;i<n;i++)
        {
            a[i]=Long.parseLong(s[i]);
            if(a[i]==0) {f=1; break;}
        }
        if(f==1) {System.out.print(0); return;}
        long mul=a[0];
        for(i=1;i<n;i++)
        if(overflow(mul,a[i])) {f=1; break;}
        else mul*=a[i];
        if(f==1) System.out.print(-1);
        else System.out.print(mul);
    }

    static boolean overflow(long a, long b)
    {
        long res=a*b;
        if(a==res/b && res<=1000000000000000000l) return false;
        else return true;
    }
}
