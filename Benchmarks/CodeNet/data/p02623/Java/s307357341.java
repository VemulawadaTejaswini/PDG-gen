import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    static final long INF = Long.MAX_VALUE;

    Main() {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        int N = sc.nextInt();
        int M = sc.nextInt();
        long K = sc.nextLong();
        long[] A = new long[N];
        long[] B = new long[M];
        long[] Aa = new long[N + 2];
        long[] Bb = new long[M + 2];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }
        for (int i = 0; i < M; i++) {
            B[i] = sc.nextLong();
        }
        
        for (int i = 1; i <= N; i++) {
            Aa[i] = Aa[i - 1] + A[i - 1];
        }
        Aa[N + 1] = INF;

        for (int i = 1; i <= M; i++) {
            Bb[i] = Bb[i - 1] + B[i - 1];
        }
        Bb[M + 1] = INF;

        int acs = binarySearch(0, N + 2, Aa, K);
        // if (ac == N + 1)
        //     ac = N;
        // ans = Math.max(ans, ac + 1);
        for (int i = 0; i <= acs; i++) {
            int ac = acs - i;
            long asum = Aa[ac];
            long rem = K - asum;
            int bc = binarySearch(0, M + 2, Bb, rem);
            // if (bc == M + 1)
            //     bc = M;
            // System.err.println(ac+"  "+bc);
            ans = Math.max(ans, ac + bc);
        }
        System.out.println(ans);
    }

    static boolean isOK(int index, long[] C, long key) {
        // if (A[index] < key)
        if (C[index] <= key)
            return false;
        else
            return true;
    }

    static int binarySearch(int min, int max, long[] C, long key) {
        int ng = min - 1, ok = max;
        while (ok - ng > 1) {
            int mid = ng + (ok - ng) / 2;
            if (isOK(mid, C, key))
                ok = mid;
            else
                ng = mid;
        }
        // if (ok == max)
        // return -1;
        // throw new Error("all false");
        return ng;
    }

    public static void main(String[] args) {
        new Main();
    }
}
