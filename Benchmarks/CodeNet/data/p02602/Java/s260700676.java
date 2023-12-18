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
        a[0] = -1;
        for (int i = 1;i<=n;++i) a[i] = sc.nextLong();

        long value = 1;
        //Queue<Long> queue = new ArrayDeque<>();
        List<Long> list = new ArrayList<>();
        long before = 0;
        for (int i = k;i<=n;++i)
        {
            if (i == k)
            {
                for (int j = k;j>i-k;--j)
                {
                   value *= a[j];
                   list.add(a[j]);
                }
                before = value;
                continue;
            }
            else
            {
                value /= list.remove(k-1);
                value *= a[i];
                list.add(0,a[i]);
            }
            //System.err.println(value);

            if (before < value) System.out.println("Yes");
            else System.out.println("No");

            before = value;
        }
        sc.close();
//        long end = System.currentTimeMillis();
//        System.err.println((end-start)+"ms");
    }
}