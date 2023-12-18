import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        long n=Long.parseLong(bu.readLine()),i,c=0;
        HashMap<Long,Integer> hm=new HashMap<>();
        for(i=2;i*i<=n;i++)
        if(n%i==0)
        {
            long cur=i;
            while(n%cur==0)
            {
                c++;
                hm.put(cur,1);
                n/=cur;
                cur*=i;
            }
        }
        if(n>=2 && hm.get(n)==null) c++;
        System.out.print(c);
    }
}
