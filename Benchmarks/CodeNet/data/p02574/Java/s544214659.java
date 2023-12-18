import java.io.*;
import java.util.*;

public class Main {
    static int[] factorCnts;
    static boolean checkCoprime = true;

    public static void factorise(int num) {
        if (!checkCoprime) return;
        for (int fact = 2; fact * fact <= num; fact++) {
            if (num % fact == 0) {
                if (factorCnts[fact] == 1) {
                    checkCoprime = false;
                    return;
                }
                factorCnts[fact]++;
                int div = num / fact;
                if (div != fact) {
                    if (factorCnts[div] == 1) {
                        checkCoprime = false;
                        return;
                    }
                    factorCnts[div]++;
                }
            }
        }
    }

    public static int gcd(int a, int b) {
        int t;
        while(b!=0)
        {
            t=b;
            b=a%b;
            a=t;
        }
        return a;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(buffer.readLine());
        String[] inp = buffer.readLine().split(" ");
        int[] arr = new int[n];
        arr[0] = Integer.parseInt(inp[0]);
        factorCnts = new int[1000001];
        int gcdRes = arr[0];
        factorise(arr[0]);
        for (int pos = 1; pos < n; pos++) {
            arr[pos] = Integer.parseInt(inp[pos]);
            factorise(arr[pos]);
            gcdRes = gcd(gcdRes, arr[pos]);
        }
        if (checkCoprime) {
            System.out.println("pairwise coprime");
        } else if (gcdRes == 1)
            System.out.println("setwise coprime");
        else
            System.out.println("not coprime");
    }
}
