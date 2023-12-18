import java.math.BigDecimal;
import java.nio.ByteBuffer;
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

        BigDecimal value = new BigDecimal(1);
        List<Long> list = new ArrayList<>();
        BigDecimal before = new BigDecimal(0);

        for (int i = k;i<=n;++i)
        {
            if (i == k)
            {
                for (int j = k;j>i-k;--j)
                {
                   value = value.multiply(new BigDecimal(a[j]));
                   list.add(a[j]);
                }

                StringBuilder stb = new StringBuilder();
                for (long h:list) stb.append(h+",");
                System.err.println(stb.toString() + "=" +value);

                before = value;
                continue;
            }
            else
            {
                long tmp = list.remove(k-1);
                value = value.divide(new BigDecimal(tmp));
                value = value.multiply(new BigDecimal(a[i]));
                list.add(0,a[i]);
            }
            StringBuilder stb = new StringBuilder();
            for (long h:list) stb.append(h+",");
            System.err.println(stb.toString() + "=" + value);

            if (value.compareTo(before) == 1) System.out.println("Yes");
            else System.out.println("No");

            before = value;
        }
        sc.close();
//        long end = System.currentTimeMillis();
//        System.err.println((end-start)+"ms");
    }
}