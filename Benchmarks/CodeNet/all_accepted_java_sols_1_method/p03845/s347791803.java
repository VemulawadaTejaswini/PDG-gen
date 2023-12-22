import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long t[]=new long[n];
        for (int i=0;i<n;++i) t[i]=sc.nextLong();
        int m=sc.nextInt();
        int p[]=new int[m];
        long x[]=new long[m];
        for (int i=0;i<m;++i)
        {
            p[i]=sc.nextInt();
            x[i]=sc.nextLong();
        }

        for (int i=0;i<m;++i)
        {
            int ans=0;
            for (int j=0;j<n;++j)
            {
                long tt=t[j];
                if (j==p[i]-1)
                {
                    tt=x[i];
                }
                ans+=tt;
            }
            System.out.println(ans);
        }
    }
}