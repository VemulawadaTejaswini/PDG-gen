import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(bu.readLine()),a[]=new int[n],fac[]=new int[1000001],i,c=0;
        String s[]=bu.readLine().split(" ");
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(s[i]);
            fac[a[i]]++;
            hm.put(a[i],hm.getOrDefault(a[i],0)+1);
        }
        if(a.length==1) {System.out.print(1); return;}

        ArrayList<Integer> al=new ArrayList<>();
        for(i=0;i<n;i++)
        if(hm.get(a[i])==1) al.add(a[i]);

        for(i=0;i<al.size();i++)
        {
            int j,fl=0,k=al.get(i);
            if(fac[k]>1 || (k!=1 && fac[1]>0)) continue;
            for(j=2;j*j<=k;j++)
            if(k%j==0)
            {
                if(fac[j]>0) {fl=1; break;}
                if(fac[k/j]>0) {fl=1; break;}
            }
            if(fl==0) c++;
        }
        System.out.print(c);
    }
}
