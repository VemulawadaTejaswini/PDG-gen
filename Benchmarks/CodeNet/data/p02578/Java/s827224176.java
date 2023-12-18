import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        //long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n+1];
        a[0] = -1;
        for (int i = 1;i<=n;++i) a[i] = sc.nextLong();
        sc.close();

//        System.err.println(n);
//        for (int i = 1;i<=n;++i) System.err.print(a[i] + ",");
//        System.err.println();

        long sum = 0;
        for (int i = 1;i<=n;++i)
        {
            if (a[i-1] > a[i])
            {
                long tmp = a[i-1] - a[i];
                sum += tmp;
                a[i] += tmp;
            }
        }
        System.out.println(sum);

//        long end = System.currentTimeMillis();
//        System.err.println((end-start)+"ms");
    }
}