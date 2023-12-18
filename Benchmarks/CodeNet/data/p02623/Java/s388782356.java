import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();
        long[] aSum = new long[n+1];
        long[] bSum = new long[m+1];

        aSum[0] = 0;
        bSum[0] = 0;
        for (int i = 1; i <= n;++i) aSum[i] = aSum[i-1] + sc.nextLong();
        for (int i = 1; i <= m;++i) bSum[i] = bSum[i-1] + sc.nextLong();

        int maxBooks = 0;
        int bBestInd = bSum.length-1;
        for (int i = 0;i<=n;++i)
        {
            long remaining = k - aSum[i];
            //System.err.println(i+":"+remaining+"(bBestInd = "+bBestInd+")");
            if (remaining < 0) break;
            int books = i;

            for (int j = bBestInd;j >= 0;--j)
            {
                if (remaining-bSum[bBestInd] >= 0)
                {
                    bBestInd = j;
                    books += j;
                    //System.err.println(i+":"+j+"(time = "+(remaining+aSum[i])+")");
                    break;
                }else
                {
                    --bBestInd;
                }
            }

            if (maxBooks < books) maxBooks = books;
        }
        //System.err.println(sumTime);
        System.out.println(maxBooks);
        sc.close();
    }
}