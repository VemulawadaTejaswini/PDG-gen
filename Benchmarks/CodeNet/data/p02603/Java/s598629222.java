import java.io.*;
import java.util.*;

class Main
{
    public static void main (String[] args) throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(bu.readLine());
        int amt=1000,i,a[]=new int[n];
        String s[]=bu.readLine().split(" ");
        for(i=0;i<n;i++)
        a[i]=Integer.parseInt(s[i]);
        ArrayList<Pair> al=new ArrayList<>();
        int l=0,r=0;
        for(i=1;i<n;i++)
        if(a[i]>=a[i-1]) r++;
        else
        {
            if(l==r) continue;
            al.add(new Pair(l,r));
            l=r=i;
        }
        if(l!=r) al.add(new Pair(l,r));
        for(i=0;i<al.size();i++)
        {
            int j,x,cs,st=al.get(i).l,en=al.get(i).r;
            if((en-st)%2==1)
            {
                x=0; cs=0;
                for(j=st;j<=en;j++)
                if(x==0)
                {
                    cs=amt/a[j];
                    amt%=a[j];
                    x=1;
                }
                else
                {
                    amt+=cs*a[j];
                    x=0;
                    cs=0;
                }
            }
            else
            {
                x=0; cs=0;
                for(j=st;j<en-1;j++)
                if(x==0)
                {
                    cs=amt/a[j];
                    amt%=a[j];
                    x=1;
                }
                else
                {
                    amt+=cs*a[j];
                    x=0;
                    cs=0;
                }
                amt+=cs*a[en];
            }
        }
        System.out.print(amt);
    }

    static class Pair
    {
        int l,r;
        Pair(int a,int b)
        {
            l=a; r=b;
        }
    }
}