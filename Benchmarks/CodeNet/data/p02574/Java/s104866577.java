import java.io.*;
import java.util.*;

public class Main {
    static int[] factorCnts;
    static boolean checkCoprime = true;

    public static void factorise(int num) {
        if (!checkCoprime)
            return;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                int a = i;
                int b = num / i;
                if (a == b)
                    b = 1;
                if (a != 1) {
                    if (factorCnts[a] == 1) {
                        checkCoprime = false;
                        return;
                    }
                    factorCnts[a]++;
                }
                if (b != 1) {
                    if (factorCnts[b] == 1) {
                        checkCoprime = false;
                        return;
                    }
                    factorCnts[b]++;
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
