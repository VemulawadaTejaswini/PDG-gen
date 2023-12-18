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
        i=0;
        while(i<n-1)
        {
            while((i<n-1) && (a[i+1]<=a[i])) i++;
            if(i==n-1) break;
            Pair e=new Pair(0,0);
            e.l=i++;
            while((i<n) && (a[i]>=a[i-1])) i++;

            e.r=i-1;
            al.add(e);
        }

        for(i=0;i<al.size();i++)
        {
            int st=amt/a[al.get(i).l];
            amt%=a[al.get(i).l];
            amt+=st*a[al.get(i).r];
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