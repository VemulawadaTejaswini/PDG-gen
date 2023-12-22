import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Compute c1 = new Compute();//calc

        long count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        //StringBuilder answer=new StringBuilder();

        //input
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n+1];
        long b[]=new long[n];
        for (int i=0;i<n+1;++i) a[i]=sc.nextLong();
        for (int i=0;i<n;++i) b[i]=sc.nextLong();

        for (int i=0;i<n;++i)
        {
            long rp=b[i]-a[i];
            if (rp<=0)
            {
                count+=b[i];
            }else
            {
                count+=a[i];
                long rp2=a[i+1]-rp;
                if (rp2<=0)
                {
                    count+=a[i+1];
                    a[i+1]=0;
                }else
                {
                    a[i+1]=rp2;
                    count+=rp;
                }
            }
        }
        System.out.println(count);
        //output
        //System.out.println(String.format("%.0f",answer));
    }
}
