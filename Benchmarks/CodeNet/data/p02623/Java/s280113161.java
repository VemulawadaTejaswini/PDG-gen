import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        String str[]=br.readLine().split(" ");
        int n=Integer.parseInt(str[0]);
        int m=Integer.parseInt(str[1]);
        long k=Long.parseLong(str[2]);
        str=br.readLine().split(" ");
        long arr1[]=new long[n];
        for(int i=0;i<n;i++)
        arr1[i]=Long.parseLong(str[i]);
        str=br.readLine().split(" ");
        long arr2[]=new long[m];
        for(int i=0;i<m;i++)
        arr2[i]=Long.parseLong(str[i]);
        long pref1[]=new long[n];
        long pref2[]=new long[m];
        TreeSet<Long> ts1=new TreeSet<>();
        TreeSet<Long> ts2=new TreeSet<>();
        TreeMap<Long,Integer> tmap1=new TreeMap<>();
        TreeMap<Long,Integer> tmap2=new TreeMap<>();
        pref1[0]=arr1[0];
        tmap1.put(pref1[0],0);
        ts1.add(pref1[0]);
        for(int i=1;i<n;i++)
        {
            pref1[i]=pref1[i-1]+arr1[i];
            ts1.add(pref1[i]);
            tmap1.put(pref1[i],i);
        }
        pref2[0]=arr2[0];
        tmap2.put(pref2[0],0);
        ts2.add(pref2[0]);
        for(int i=1;i<m;i++)
        {
            pref2[i]=pref2[i-1]+arr2[i];
            ts2.add(pref2[i]);
            tmap2.put(pref2[i],i);
        }
        int max=0;
        int cnt=0;
        for(long i:ts1)
        {
            long temp=k-i;
            if(ts2.floor(temp)!=null)
            {
                long temp2=ts2.floor(temp);
                //pw.println(temp2);
                int ind=tmap2.get(temp2);
                max=Math.max(max,cnt+ind+2);
            }
            cnt++;
        }
        cnt=0;
        for(long i:ts2)
        {
            long temp=k-i;
            if(ts1.floor(temp)!=null)
            {
                long temp2=ts1.floor(temp);
                int ind=tmap1.get(temp2);
                max=Math.max(max,cnt+ind+2);
            }
            cnt++;
        }
        pw.println(max);
        pw.flush();
        pw.close();
    }
}