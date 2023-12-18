import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        String s[]=bu.readLine().split(" ");
        int n=Integer.parseInt(s[0]),k=Integer.parseInt(s[1]),i,a[]=new int[n],ans=1;
        s=bu.readLine().split(" ");
        for(i=0;i<n;i++)
        a[i]=Integer.parseInt(s[i]);
        int l=1,r=1000000000,mid;
        while(l<=r)
        {
            mid=(l+r)/2;
            long cn=cuts(a,mid);
            if(cn>k) l=mid+1;
            else {ans=mid; r=mid-1;}
        }
        System.out.print(ans);
    }

    static long cuts(int a[],int k)
    {
        int i; long c=0;
        for(i=0;i<a.length;i++)
        c+=(a[i]-1)/k;
        return c;
    }
}