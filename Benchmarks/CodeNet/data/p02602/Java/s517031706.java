import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        //long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[n+1];
        a[0] = 1L;
        for (int i = 1;i<=n;++i) a[i] = sc.nextLong();
        sc.close();

        List<Long> list = new ArrayList<>();

        for (int i = k;i<=n;++i)
        {
            if (i == k)
            {
                for (int j = k;j>i-k;--j)
                {
                   list.add(a[j]);
                }
            }
            else
            {
                long befoer = list.remove(k-1);
                long now = a[i];
                if (a[i] > befoer) System.out.println("Yes");
                else System.out.println("No");

                list.add(0,now);
            }
        }
//        long end = System.currentTimeMillis();
//        System.err.println((end-start)+"ms");
    }
}