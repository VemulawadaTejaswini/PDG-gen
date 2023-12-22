import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        //Compute c1 = new Compute();//calc

        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        //StringBuilder answer=new StringBuilder();

        //input
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long k=sc.nextLong();
        int q=sc.nextInt();
        int a[]=new int[q];
        for (int i=0;i<q;++i)
        {
            a[i]=sc.nextInt();
        }

        String ans[]=new String[n];
        for (int i=0;i<n;++i) ans[i]="Yes";

        long point[]=new long[n];
        for (int i=0;i<n;++i) point[i]=k-q;

        for (int i=0;i<q;++i)
        {
            point[a[i]-1]+=1;
        }

        for (int i=0;i<n;++i)
        {
            if (point[i]<=0) ans[i]="No";
        }

        for (int i=0;i<n;++i) System.out.println(ans[i]);
    }
}