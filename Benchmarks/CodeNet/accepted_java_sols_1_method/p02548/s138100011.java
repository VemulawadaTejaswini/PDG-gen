import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        //long start = System.currentTimeMillis();
        final long MOD = (long)Math.pow(10,9)+7;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int a = 1;a<=n;++a)
        {
            count += n/a;
            if (n%a == 0) --count;
        }
        System.out.println(count);
        sc.close();
//        long end = System.currentTimeMillis();
//        System.err.println((end-start)+"ms");
    }
}