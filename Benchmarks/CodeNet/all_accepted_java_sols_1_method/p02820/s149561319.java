import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {

    static final int MOD = 1000000007;
    static final int INF = 1 << 30;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int R = sc.nextInt();
        int S = sc.nextInt();
        int P = sc.nextInt();
        char[] T = sc.next().toCharArray();
        char[] a = new char[T.length];
        char r = 'r';
        char s = 's';
        char p = 't';
        // int[][] dp = new int[N][3];// r s p
        // dp[0][r] = T[i] == 's' ? R : 0;
        // dp[0][s] = T[i] == 'p' ? S : 0;
        // dp[0][p] = T[i] == 'r' ? P : 0;
        // for (int i = 1; i < K; i++) {
        // int max = 0;
        // for (int k = 0; k < 3; k++) {
        // max = Math.max(max, dp[i - 1][k]);
        // }
        // dp[i][r] = T[i] == 's' ? max + R : max;
        // dp[i][s] = T[i] == 'p' ? max + S : max;
        // dp[i][p] = T[i] == 'r' ? max + P : max;
        // }
        // for (int i = K; i < N; i++) {
        // int max;
        // max=Math.max(dp[i-1][])

        // dp[i][r]=
        // }
        char pt, ut;
        char ptt, utt;
        char pttt, uttt;
        if (R >= S && R >= P) {
            pt = r;
            if (S >= P) {
                ptt = s;
                pttt = p;
            } else {
                ptt = p;
                pttt = s;
            }
        } else if (S >= R && S >= P) {
            pt = s;
            if (R >= P) {
                ptt = r;
                pttt = p;
            } else {
                ptt = p;
                pttt = r;
            }
        } else {
            pt = p;
            if (R >= S) {
                ptt = r;
                pttt = s;
            } else {
                ptt = s;
                pttt = r;
            }
        }
        for (int i = 0; i < K; i++) {
            if (T[i] == 'r' && pt == p)
                a[i] = p;

            if (T[i] == 's' && pt == r)
                a[i] = r;

            if (T[i] == 'p' && pt == s)
                a[i] = s;
        }
        for (int i = K; i < N; i++) {
            if (T[i - K] == T[i] && a[i - K] == pt)
                continue;
            if (T[i] == 'r' && pt == p)
                a[i] = p;

            if (T[i] == 's' && pt == r)
                a[i] = r;

            if (T[i] == 'p' && pt == s)
                a[i] = s;
        }

        for (int i = 0; i < K; i++) {
            if (T[i] == 'r' && ptt == p)
                a[i] = p;

            if (T[i] == 's' && ptt == r)
                a[i] = r;

            if (T[i] == 'p' && ptt == s)
                a[i] = s;
        }
        for (int i = K; i < N; i++) {
            if (T[i - K] == T[i] && a[i - K] == ptt)
                continue;
            if (T[i] == 'r' && ptt == p)
                a[i] = p;

            if (T[i] == 's' && ptt == r)
                a[i] = r;

            if (T[i] == 'p' && ptt == s)
                a[i] = s;
        }

        for (int i = 0; i < K; i++) {
            if (T[i] == 'r' && pttt == p)
                a[i] = p;

            if (T[i] == 's' && pttt == r)
                a[i] = r;

            if (T[i] == 'p' && pttt == s)
                a[i] = s;
        }
        for (int i = K; i < N; i++) {
            if (T[i - K] == T[i] && a[i - K] == pttt)
                continue;
            if (T[i] == 'r' && pttt == p)
                a[i] = p;

            if (T[i] == 's' && pttt == r)
                a[i] = r;

            if (T[i] == 'p' && pttt == s)
                a[i] = s;
        }
        long ans = 0;
        for (int i = 0; i < N; i++) {
            if (T[i] == 'r' && a[i] == p)
                ans += P;

            if (T[i] == 's' && a[i] == r)
                ans += R;

            if (T[i] == 'p' && a[i] == s)
                ans += S;
        }

        System.out.println(ans);
    }
}
