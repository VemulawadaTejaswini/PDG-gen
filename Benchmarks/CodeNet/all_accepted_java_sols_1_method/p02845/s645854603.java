
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        boolean[] same = new boolean[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt()+1;
        }
        int[] dp = new int[N+1];
        long ans = 1;
        int col = 0;
        dp[0]=3;
        for (int i = 0; i < N; i++) {
            // System.out.println(dp[a[i] - 1]);
            ans *= dp[a[i] - 1];
            ans %= MOD;
            dp[a[i]-1]--;
            dp[a[i]]++;
        }
        // switch(col){
        // case 1:ans*=3;break;

        // case 2:ans*=6;break;

        // case 3:ans*=6;break;
        // }
        // ans %= MOD;

        System.out.println(ans);
    }
}