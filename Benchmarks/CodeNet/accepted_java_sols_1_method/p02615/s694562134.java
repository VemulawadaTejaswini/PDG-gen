import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int n=Integer.parseInt(br.readLine());
        long arr[]=new long[n];
        String str[]=br.readLine().split(" ");
        for(int i=0;i<n;i++)
        arr[i]=Long.parseLong(str[i]);
        TreeMap<Long,Integer> tmap=new TreeMap<>();
        for(int i=0;i<n;i++)
        tmap.put(arr[i],tmap.getOrDefault(arr[i],0)+1);
        n--;
        long ans=0;
        long tk=tmap.lastKey();
        tmap.put(tk,tmap.get(tk)*2-1);
        while(n>0)
        {
            long lk=tmap.lastKey();
            int val=tmap.get(lk);
            if(2*val-1<=n)
            {
                ans+=lk*val;
                n-=val;
            }
            else
            {
                ans+=lk*n;
                n=0;
            }
            tmap.remove(lk);
            if(tmap.size()>0)
            {
                long k=tmap.lastKey();
                tmap.put(k,tmap.get(k)*2);
            }
        }
        pw.println(ans);
        pw.flush();
        pw.close();
    }
}