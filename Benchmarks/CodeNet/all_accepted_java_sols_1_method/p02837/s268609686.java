
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
        int[][] map = new int[N][N];
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            for (int k = 0; k < a; k++) {
                int p = sc.nextInt() - 1;
                int bool = (sc.nextInt() == 1) ? 1 : -1;
                map[i][p] = bool;
            }
        }
        // for (int i = 0; i < N; i++) {
        //     System.out.println(Arrays.toString(map[i]));
        // }
        int ans = 0;
        for (int mask = 0; mask < (1 << N); mask++) {
            // System.out.println(Integer.toBinaryString(mask));
            int trs = Integer.bitCount(mask);
            int[] ck = new int[N];
            for (int i = 0; i < N; i++) {
                // System.out.println(Integer.toBinaryString(1 << i));
                ck[i] = (mask & (1 << i)) != 0 ? 1 : -1;
            }
            //System.out.println(Arrays.toString(ck));
            int i;
            turn: for (i = 0; i < N; i++) {
                if (ck[i] == -1)
                    continue;
                for (int k = 0; k < N; k++) {
                    //System.out.println(map[i][k] + "  " + ck[k]);
                    if (map[i][k] != 0) {
                        if (ck[k] != map[i][k])
                            break turn;
                    }
                }
            }
            if (i == N)
                ans = Math.max(ans, trs);
        }

        System.out.println(ans);
    }
}