import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        //long start = System.currentTimeMillis();
        final long MOD = (long)Math.pow(10,9)+7;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //----------------------------------------
        long nasi0 = powmod(9,n);
        long nasi10 = powmod(9,n);
        long tomoninasi = powmod(8,n);
        long dotirakanasi = ((nasi0 + nasi10)%MOD - tomoninasi)%MOD;

        long zenbu = powmod(10,n);;

        System.out.println((zenbu-dotirakanasi)%MOD);

        sc.close();
//        long end = System.currentTimeMillis();
//        System.err.println((end-start)+"ms");
    }

    public static long powmod(long x, long y)
    {
        long ret = 1;
        long MOD = (long)Math.pow(10,9)+7;
        for (int i = 0;i<y;++i)
        {
            ret = ret * x % MOD;
        }
        return ret;
    }
}