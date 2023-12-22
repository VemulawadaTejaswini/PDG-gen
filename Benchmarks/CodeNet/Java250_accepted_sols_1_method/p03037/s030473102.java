import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int m = sc.nextInt();
        int lMax = Integer.MIN_VALUE;
        int rMin = Integer.MAX_VALUE;

        for (int i = 0;i<m;++i)
        {
            int l = sc.nextInt();
            int r = sc.nextInt();
            if (lMax < l) lMax = l;
            if (rMin > r) rMin = r;
        }

        int count = 0;
        for (int i = 0;i<=n;++i) if (lMax <= i && rMin >= i) ++count;

        System.out.println(count);
        sc.close();
    }
}