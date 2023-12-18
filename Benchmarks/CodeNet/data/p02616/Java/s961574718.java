import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author shubhamsaxena
 * Solution is at the Top
 */
class Main {

    private static final int MOD = (int) 1e9 + 7;

    private void solve() {
        int n = inpi();
        int k = inpi();
        int[] arr = inpia(n);
        long res = (maxProduct(arr, n, k));
        out.print((res + MOD) % MOD);
    }

    private long maxProduct(int[] A, int n, int k) {
        Arrays.sort(A);
        long result = 1;

        if (A[n - 1] == 0 && k % 2 != 0)
            return 0;
        if (A[n - 1] <= 0 && k % 2 != 0) {
            for (int i = n - 1; i >= n - k; i--)
                result = (result * A[i]) % MOD;
            return result;
        }

        int i = 0;
        int j = n - 1;
        if (k % 2 != 0) {
            result = (result * A[i]) % MOD;
            j--;
            k--;
        }
        k >>= 1;
        for (int itr = 0; itr < k; itr++) {
            long l = (1L * A[i] * A[i + 1]) % MOD;
            long r = (1L * A[j] * A[j - 1]) % MOD;
            if (l > r) {
                result = (result * l) % MOD;
                i += 2;
            } else {
                result = (result * r) % MOD;
                j -= 2;
            }
        }
        return result;
    }


    private long nCr(long n, long r) {
        long res = n;
        for (long i = 2; i <= r; i++) {
            res = (res * (n - i + 1)) / i;
        }
        return res;
    }

    public boolean isPrime(long n) {
        return BigInteger.valueOf(n).isProbablePrime(5);
    }

    public void SieveOfEratosthenes(int n) {
        boolean prime[] = new boolean[n + 1];
        Arrays.fill(prime, true);
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * 2; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        // Print all prime numbers
        for (int p = 2; p <= n; p++) {
            if (prime[p]) {
                //  System.out.print(p+" ");
                // primes[p] = true;
            }
        }
        // return list;
    }

    InputStream obj;
    PrintWriter out;
    String check = "";

    public static void main(String[] args) {
        new Thread(null, new Runnable() {
            public void run() {
                new Main().main1();
            }
        }, "1", 1 << 26).start();

    }

    void main1() {
        out = new PrintWriter(System.out);
        obj = check.isEmpty() ? System.in : new ByteArrayInputStream(check.getBytes());
        solve();
        out.flush();
        out.close();
    }

    private byte[] inbuffer = new byte[2048];
    private int lenbuffer = 0, ptrbuffer = 0;

    int readByte() {
        if (lenbuffer == -1) {
            throw new InputMismatchException();
        }
        if (ptrbuffer >= lenbuffer) {
            ptrbuffer = 0;
            try {
                lenbuffer = obj.read(inbuffer);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
        }
        if (lenbuffer <= 0) {
            return -1;
        }
        return inbuffer[ptrbuffer++];
    }

    boolean isSpaceChar(int c) {
        return (!(c >= 33 && c <= 126));
    }

    int skip() {
        int b;
        while ((b = readByte()) != -1 && isSpaceChar(b)) ;
        return b;
    }

    String inps() {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while (!(isSpaceChar(b))) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    int inpi() {
        int num = 0, b;
        boolean minus = false;
        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        while (true) {
            if (b >= '0' && b <= '9') {
                num = num * 10 + (b - '0');
            } else {
                return minus ? -num : num;
            }
            b = readByte();
        }
    }

    long inpl() {
        long num = 0;
        int b;
        boolean minus = false;
        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        while (true) {
            if (b >= '0' && b <= '9') {
                num = num * 10 + (b - '0');
            } else {
                return minus ? -num : num;
            }
            b = readByte();
        }
    }

    float inpf() {
        return Float.parseFloat(inps());
    }

    double inpd() {
        return Double.parseDouble(inps());
    }

    char inpc() {
        return (char) skip();
    }

    int[] inpia(int n) {
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = inpi();
        }
        return a;
    }

    long[] inpla(int n) {
        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = inpl();
        }
        return a;
    }

    String[] inpsa(int n) {
        String a[] = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = inps();
        }
        return a;
    }

    double[][] inpdm(int n, int m) {
        double a[][] = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = inpd();
            }
        }
        return a;
    }

    int[][] inpim(int n, int m) {
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = inpi();
            }
        }
        return a;
    }
}