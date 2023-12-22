import java.io.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(bu.readLine());
        String s[]=bu.readLine().split(" ");
        int i,a[]=new int[n];
        long sum=0,res=0,M=1000000007;
        for(i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(s[i]);
            sum+=a[i];
        }

        for(i=0;i<n;i++)
        {
            sum-=a[i];
            res+=sum%M*a[i]%M;
            res%=M;
        }
        System.out.print(res);
    }
}
