import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        //long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println();

        int max = (int)Math.sqrt(n);

        int[] record = new int[n+1];
        Arrays.fill(record,0);
        
        for (int x = 1;x<=max;++x)
        {
            for (int y = 1;y<=max;++y)
            {
                for (int z = 1;z<=max;++z)
                {
                    int tmp = (int) Math.pow(x,2) + (int) Math.pow(y,2) + (int) Math.pow(z,2)
                            + x*y + y*z + x*z;

                    if (tmp <= n) ++record[tmp];
                }
            }
        }

        for (int i = 1;i<=n;++i) System.out.println(record[i]);
        sc.close();
//        long end = System.currentTimeMillis();
//        System.err.println((end-start)+"ms");
    }
}