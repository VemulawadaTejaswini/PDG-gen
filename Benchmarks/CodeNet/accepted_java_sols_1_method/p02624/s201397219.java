import java.io.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(bu.readLine()),i,a[]=new int[n+1];

        for(i=2;i<=n;i++)
        for(int j=i;j<=n;j+=i)
        a[j]++;
        long ans=0;
        for(i=1;i<=n;i++)
        ans+=1l*i*(a[i]+1);
        System.out.print(ans);
    }
}
