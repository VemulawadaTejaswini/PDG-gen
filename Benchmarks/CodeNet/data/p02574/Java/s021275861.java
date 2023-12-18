import java.io.*;
import java.util.*;

public class Main {
    static int[] factorCnts;
    static boolean checkCoprime = true;

    public static void factorise(int num) {
        if (!checkCoprime) return;
        if (num % 2 == 0) {
            factorCnts[2]++;
            int dup = num;
            while (dup % 2 == 0)
                dup /= 2;
        }
        if (factorCnts[2] > 1) {
            checkCoprime = false;
            return;
        }
        for (int fact = 3; fact * fact <= num; fact += 2) {
            if (num % fact == 0) {
                int dup = num;
                factorCnts[fact]++;
                while (dup % fact == 0)
                    dup /= fact;
                if (dup > 1)
                    factorCnts[dup]++;
                if (factorCnts[dup] > 1 || factorCnts[fact] > 1) {
                    checkCoprime = false;
                    return;
                }
            }
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buffer.readLine());
        String[] inp = buffer.readLine().split(" ");
        int[] arr = new int[n];
        arr[0] = Integer.parseInt(inp[0]);
        factorCnts = new int[1000001];
        int gcdRes = arr[0];
        for (int pos = 1; pos < n; pos++) {
            arr[pos] = Integer.parseInt(inp[pos]);
            gcdRes = gcd(gcdRes, arr[pos]);
        }
        for (int pos = 0; pos < n; pos++) {
            factorise(arr[pos]);
        }
        if (checkCoprime) {
            System.out.println("pairwise coprime");
        } else if (gcdRes == 1)
            System.out.println("setwise coprime");
        else
            System.out.println("not coprime");
    }
}
