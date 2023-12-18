import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(bu.readLine());
        int a[][]=new int[n][2],i;
        for(i=0;i<n;i++)
        {
            String s[]=bu.readLine().split(" ");
            a[i][0]=Integer.parseInt(s[0]);
            a[i][1]=Integer.parseInt(s[1]);
        }

        long max=Long.MIN_VALUE; int pp[]={1,-1},qq[]={1,-1};
        for(int p:pp)
        for(int q:qq)
        {
            long sm=p*a[0][0]+q*a[0][1];
            for(i=1;i<n;i++)
            {
                long cur=p*a[i][0]+q*a[i][1];
                max=Math.max(max,cur-sm);
                sm=Math.min(sm,cur);
            }
        }
        System.out.print(max);
    }
}
