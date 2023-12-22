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
        int d[] = new int[n];
        for (int i=0;i<n;++i) d[i]=sc.nextInt();

        int ans = 0;
        for (int i=0;i<n;++i)
        {
            for (int j =0;j<n;++j)
            {
                if (j==i)continue;
                ans +=d[i]*d[j];
            }
        }
        ans /=2;

        System.out.println(ans);
        sc.close();
    }
}