import java.io.*;
import java.util.*;

class Main
{
    public static void main (String[] args) throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(bu.readLine()),i,k=0;
        char s[]=bu.readLine().toCharArray();
        long p21[]=new long[n], p22[]=new long[n];
        for(i=0;i<n;i++)
        if(s[i]=='1') k++;

        boolean flag=true;
        if(k-1==0) flag=false;
        p21[0]=1; p22[0]=1;
        for(i=1;i<n;i++)
        {
            p21[i]=p21[i-1]*2%(k+1);
            if(flag) p22[i]=p22[i-1]*2%(k-1);
        }

        long l1[]=new long[n],r1[]=new long[n],sum1=0,sum2=0,l2[]=new long[n],r2[]=new long[n];
        for(i=0;i<n;i++)
        {
            l1[i]=sum1;
            l2[i]=sum2;
            if(s[i]=='1')
            {
                sum1+=p21[n-i-1];
                sum2+=p22[n-i-1];
            }
        }
        sum1=0; sum2=0;
        for(i=n-1;i>=0;i--)
        {
            r1[i]=sum1;
            r2[i]=sum2;
            if(s[i]=='1')
            {
                sum1+=p21[n-i-1];
                sum2+=p22[n-i-1];
            }
        }

        for(i=0;i<n;i++)
        {
            if(s[i]=='0')
            {
                sum1=l1[i]+r1[i]+p21[n-i-1];
                sb.append(rounds(sum1,k+1)+"\n");
            }
            else
            {
                if(!flag) {sb.append("0\n"); continue;}
                sum1=l2[i]+r2[i];
                sb.append(rounds(sum1,k-1)+"\n");
            }
        }
        System.out.print(sb);
    }

    static int rounds(long n,int k)
    {
        int ans=1; n%=k;
        while(n!=0)
        {
            n=n%setbits((int)n);
            ans++;
        }
        return ans;
    }

    static int setbits(int n)
    {
        int c=0;
        while(n!=0)
        {
            if((n&1)==1) c++;
            n>>=1;
        }
        return c;
    }
}