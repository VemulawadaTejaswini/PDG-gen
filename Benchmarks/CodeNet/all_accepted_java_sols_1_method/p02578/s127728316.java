import java.io.*;
class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(bu.readLine()),a[]=new int[n],i;
        long ans=0;
        String s[]=bu.readLine().split(" ");
        for(i=0;i<n;i++)
        a[i]=Integer.parseInt(s[i]);

        for(i=1;i<n;i++)
        if(a[i]<a[i-1])
        {
            ans+=a[i-1]-a[i];
            a[i]=a[i-1];
        }
        System.out.print(ans);
    }
}
