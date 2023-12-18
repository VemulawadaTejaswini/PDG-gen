import java.io.*;
import java.util.*;
class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s[]=bu.readLine().split(" ");
        int n=Integer.parseInt(s[0]),k=Integer.parseInt(s[1]),i,a[]=new int[n],c[]=new int[n];
        s=bu.readLine().split(" ");
        for(i=0;i<n;i++)
            a[i]=Integer.parseInt(s[i])-1;
        s=bu.readLine().split(" ");
        for(i=0;i<n;i++)
            c[i]=Integer.parseInt(s[i]);
        long max=Long.MIN_VALUE;
        for(i=0;i<n;i++)
        {
            long cur=0,tot=c[i]; int p=a[i],l=1;
            while(p!=i)
            {
                tot+=c[p];
                p=a[p];
                l++;
            }
            int m=k%l,tur=k/l;
            if(k%l==0 && tur!=0) {m=l; tur--;}
            tot*=tur;

            p=i;
            while(m!=0)
            {
                cur+=c[p];
                p=a[p];
                m--;
                max=Math.max(max,cur);
                max=Math.max(max,tot+cur);
                if(p==i) break;
            }
            //System.out.println(cur);
        }
        System.out.print(max);
    }
}
