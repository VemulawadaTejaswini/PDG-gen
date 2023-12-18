import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(bu.readLine());
        if(n<2) {System.out.print(0); return;}

        int i; long p10[]=new long[n+1],p8[]=new long[n+1],p9[]=new long[n+1],M=1000000007;
        p10[0]=p8[0]=p9[0]=1;
        for(i=1;i<=n;i++)
        {
            p10[i]=p10[i-1]*10%M;
            p8[i]=p8[i-1]*8%M;
            p9[i]=p9[i-1]*9%M;
        }

        long ans=p10[n]-(p8[n]+(p9[n]-p8[n]+M)*2%M)%M;
        ans=(ans+M)%M;
        System.out.print(ans);
    }
}
