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
        long h[] = new long[n];
        for (int i=0;i<n;++i) h[i]=sc.nextLong();

        String ans[]={"Yes","No"};
        int ansInd=0;

        for (int i=n-1;i>0;--i)
        {
            long h1=h[i];
            long h2=h[i-1];

            if (h1>=h2) continue;

            long h3=h2-1;
            if (h1<h3)
            {
                ansInd=1;
                break;
            }else
            {
                h[i-1]=h3;
                continue;
            }
        }
        System.out.println(ans[ansInd]);
        //output
        //System.out.println(String.format("%.0f",answer));
    }
}