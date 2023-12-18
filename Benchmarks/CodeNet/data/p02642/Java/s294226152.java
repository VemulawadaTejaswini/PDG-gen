import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(bu.readLine()),a[]=new int[n],i,c=0;
        String s[]=bu.readLine().split(" ");
        for(i=0;i<n;i++)
        a[i]=Integer.parseInt(s[i]);
        Arrays.sort(a);
        if(a.length==1) {System.out.print(1); return;}
        int fac[]=new int[1000001];
        if(a[0]!=a[1]) c++;
        fac[a[0]]++;
        for(i=1;i<n;i++)
        {
            int j,fl=0;
            for(j=1;j*j<=a[i];j++)
            if(a[i]%j==0)
            {
                if(fac[j]!=0) {fl=1; break;}
                if(fac[a[i]/j]!=0) {fl=1; break;}
            }
            if(fl==0) c++;
            fac[a[i]]++;
        }
        System.out.print(c);
    }
}
