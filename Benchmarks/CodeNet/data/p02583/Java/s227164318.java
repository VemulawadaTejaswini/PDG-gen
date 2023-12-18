import java.util.*;
import java.io.*;
// import lib.util.*;
// import lib.graph.*;
// import lib.io.*;
// import lib.math.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] L = new long[N];
        for (int i = 0; i < N; i++) {
            L[i] = sc.nextLong();
        }
        int res3 = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    long a = L[i];
                    long b = L[j];
                    long c = L[k];
                    if (a == b || b == c || a == c) {
                        continue;
                    }

                    if (Math.abs(b - c) < a && a < b + c) {
                        res3++;
                    }
                }
            }
        }
        System.out.println(res3 / 6);
    }
}