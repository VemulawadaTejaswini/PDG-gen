import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
//        long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int r = (int)Math.sqrt(n);
        int max = Math.pow(r,2)+r+r <= n ? r:r-1;

        Map<Integer,Integer> record = new HashMap<>();
        for (int i = 1;i<=max;++i)
        {
            for (int x = 1;x<=max;++x)
            {
                for (int y = 1;y<=x;++y)
                {
                    for (int z = 1;z<=y;++z)
                    {
                        int sum = 0;
                        sum += (int) Math.pow(x,2) + (int) Math.pow(y,2) + (int) Math.pow(z,2)
                                + x*y + y*z + x*z;
                        if (record.get(sum) == null) record.put(sum,1);
                        else
                        {
                            int tmp = record.get(sum);
                            record.put(sum,tmp+1);
                        }
                    }
                }
            }
        }

        for (int i = 1;i<=n;++i)
        {
            if (record.get(i)==null) System.out.println(0);
            else System.out.println(record.get(i));
        }
        sc.close();
//        long end = System.currentTimeMillis();
//        System.err.println((end-start)+"ms");
    }
}