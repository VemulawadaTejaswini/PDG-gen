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
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;
    static final int ALF = 26;

    Main() {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        int H = sc.nextInt();
        int W = sc.nextInt();
        int K = sc.nextInt();
        int[][] board = new int[H][W];
        for (int i = 0; i < H; i++) {
            char[] seq = sc.next().toCharArray();
            for (int k = 0; k < W; k++)
                board[i][k] = seq[k] == '#' ? 1 : 0;
        }

        for (int bin = 0; bin < (1 << (H + W)); bin++) {
            int sum = 0;
            for (int h = 0; h < H; h++) {
                if ((bin & (1 << h)) != 0)
                    continue;
                for (int w = 0; w < W; w++) {
                    if ((bin & (1 << (H + w))) != 0)
                        continue;
                    sum += board[h][w];
                }
            }
            // System.err.println(Integer.toBinaryString(bin));
            // System.err.println(sum);
            if (sum == K)
                ans++;
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        new Main();
    }
}
