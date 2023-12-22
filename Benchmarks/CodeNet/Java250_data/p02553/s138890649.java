import java.util.*;

public class Main
{
    public static void main(String[] args) {
        //long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        long[] a = new long[2];
        long[] b = new long[2];
        a[0] = sc.nextLong();
        a[1] = sc.nextLong();
        b[0] = sc.nextLong();
        b[1] = sc.nextLong();

        long max = Long.MIN_VALUE;
        for (int i = 0;i<2;++i)
        {
            for (int j = 0;j<2;++j)
            {
                long tmp = a[i]*b[j];
                max = Math.max(tmp,max);
            }
        }
        System.out.println(max);
        sc.close();
//        long end = System.currentTimeMillis();
//        System.err.println((end-start)+"ms");
    }
}