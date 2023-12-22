import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        //long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] l = new long[n+1];
        l[0] = -1;
        int count = 0;
        for (int i = 1;i<=n;++i) l[i] = sc.nextLong();

        for (int i = 0;i<=n-2;++i)
        {
            for (int j = i+1;j<=n-1;++j)
            {
                for (int k = j+1;k <= n;++k)
                {
                    if (l[i]+l[j] > l[k] && l[i]+l[k] > l[j] && l[j]+l[k] > l[i])
                    {
                        if (l[i] != l[j] && l[j] != l[k] && l[i] != l[k])
                        {
                            //System.err.println(i+","+j+","+k);
                            ++count;
                        }
                    }
                }
            }
        }
        System.out.println(count);
        sc.close();
//        long end = System.currentTimeMillis();
//        System.err.println((end-start)+"ms");
    }
}