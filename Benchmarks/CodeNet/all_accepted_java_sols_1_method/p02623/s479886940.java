import java.util.*;
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        long[] asum = new long[n + 1];
        long[] bsum = new long[m + 1];
        for (int i = 0; i < n; i++) {
            asum[i + 1] = asum[i] + a[i];
        }
        for (int i = 0; i < m; i++) {
            bsum[i + 1] = bsum[i] + b[i];
        }
        boolean cont = false;
        int retk = k;
        int ans = 0;
        int asid = 0;
        int bsid = 0;
        int aeid = n;
        int beid = m;
        while (true) {
            while (true) {
                if (asum[aeid] - asum[asid] > retk)
                    aeid--;
                else
                    break;
            }
            while (true) {
                if (bsum[beid] - bsum[bsid] > retk)
                    beid--;
                else
                    break;
            }
            
            int tmpa = aeid - asid;
            int tmpb = beid - bsid;
            if (tmpa == 0 && tmpb == 0)
                break;
            if (tmpa > tmpb) {
                retk -= a[asid];
                ans++;
                asid++;
            } else {
                retk -= b[bsid];
                ans++;
                bsid++;
            }
        }

        System.out.println(ans);
        



    }
}