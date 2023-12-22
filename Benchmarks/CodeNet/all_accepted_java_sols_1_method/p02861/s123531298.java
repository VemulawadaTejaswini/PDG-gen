import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
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
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0;i<n;++i)
        {
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
        }

        int sosu = 1;
        for (int i=1;i<=n;++i)
        {
            sosu*=i;
        }

        double sum = 0;
        for (int i=0;i<n;++i)
        {
            for (int j = 0;j<n;++j)
            {
                if (i==j) continue;
                double xx = Math.pow((double)x[i]-x[j],2.0);
                double yy = Math.pow((double)y[i]-y[j],2.0);
                double a = Math.sqrt(xx+yy);
                //System.out.println(a);
                sum+=a;
            }
        }
        System.out.println(sum/n);
        sc.close();
    }
}