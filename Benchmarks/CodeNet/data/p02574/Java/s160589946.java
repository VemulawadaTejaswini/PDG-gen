import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=1000000,i,j; boolean c[]=new boolean[N+1];
        for(i=2;i<=N;i++)
        if(!c[i])
        for(j=2*i;j<=N;j+=i)
        c[j]=true;

        ArrayList<Integer> pr=new ArrayList<>();
        for(i=2;i<=N;i++)
        if(!c[i]) pr.add(i);

        HashMap<Integer,Integer> hm=new HashMap<>();
        int sz=pr.size(),ar[]=new int[sz];
        for(i=0;i<sz;i++)
        hm.put(pr.get(i),i);

        int n=Integer.parseInt(bu.readLine());
        int a[]=new int[n];
        String s[]=bu.readLine().split(" ");
        for(i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(s[i]);
            int x=a[i];
            for(j=2;j*j<=x;j++)
            if(x%j==0)
            {
                ar[hm.get(j)]++;
                while(x%j==0) x/=j;
            }
            if(x>=2) ar[hm.get(x)]++;
        }

        int max=0;
        for(i=0;i<sz;i++)
        max=Math.max(max,ar[i]);
        if(max<2) {System.out.print("pairwise coprime"); return;}

        int g=a[0];
        for(i=1;i<n;i++)
        g=gcd(g,a[i]);
        if(g==1) sb.append("setwise coprime");
        else sb.append("not coprime");
        System.out.print(sb);
    }

    static int gcd(int a,int b)
    {
        int t;
        while(b!=0)
        {
            t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
}
