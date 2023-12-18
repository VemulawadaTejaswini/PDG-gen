import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s[]=bu.readLine().split(" ");
        long n=Long.parseLong(s[0]),x=Integer.parseInt(s[1]); int m=Integer.parseInt(s[2]);
        boolean vis[]=new boolean[m];
        ArrayList<Integer> al=new ArrayList<>();
        if(x<m) {vis[(int)x]=true; n--; al.add((int)x);}
        long sum=x,fx=x; int found=-1,i;

        while(n!=0)
        {
            x=x*x%m;
            int t=(int)x;
            if(!vis[t])
            {
                vis[t]=true;
                al.add(t);
                sum+=t;
            }
            else
            {
                found=t;
                break;
            }
            n--;
        }
        if(n==0) {System.out.print(sum); return;}

        long sum1=0,sum2=0; int rem=0;
        for(i=0;i<al.size();i++)
        if(al.get(i)==found) break;
        else
        {
            rem++;
            sum1+=al.get(i);
        }

        for(;i<al.size();i++)
        sum2+=al.get(i);

        n+=al.size()-rem;
        long req=n/(al.size()-rem);
        sum=sum1+req*sum2;
        if(fx>=m) sum+=fx;

        n=n%(al.size()-rem);
        for(i=rem;n!=0;i++,n--)
        sum+=al.get(i);
        System.out.print(sum);
    }
}
