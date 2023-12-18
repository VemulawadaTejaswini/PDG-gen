//Created by Aminul on 7/5/2020.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt(), k = in.nextInt();
        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        pw.println(maxProductOfKNumbers(a, n, k));

        pw.close();
    }

    static long maxProductOfKNumbers(long[] a, int n, int k) {
        shuffle(a);
        Arrays.sort(a);
        long product = 1, mod = (long) 1e9 + 7;

        if (a[n - 1] == 0 && k % 2 != 0)
            return 0;
        if (a[n - 1] <= 0 && k % 2 != 0) {
            for (int i = n - 1; i >= n - k; i--)
                product = mod(product * a[i], mod);
            return product;
        }

        int i = 0;
        int j = n - 1;
        if (k % 2 != 0) {
            product = mod(product * a[j], mod);
            j--;
            k--;
        }
        k >>= 1;
        for (int itr = 0; itr < k; itr++) {
            long leftProduct = a[i] * a[i + 1];
            long rightProduct = a[j] * a[j - 1];
            if (leftProduct > rightProduct) {
                product = mod(product * (leftProduct % mod), mod);
                i += 2;
            } else {
                product = mod(product * (rightProduct % mod), mod);
                j -= 2;
            }
        }
        return product;
    }

    public static long mod(long a, long m) {
        long A = (a % m);
        return A >= 0 ? A : A + m;
    }

    public static void shuffle(long[] a) {
        Random rnd = new Random();
        for (int i = a.length - 1; i >= 1; i--) {
            int j = rnd.nextInt(i + 1);
            long t = a[i];
            a[i] = a[j];
            a[j] = t;
        }
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}